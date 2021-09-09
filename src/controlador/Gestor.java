package controlador;

import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Componente;
import modelo.Computadora;

public class Gestor {

    Conexion db = new Conexion();
    Connection conexion = db.conectar();
    
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void agregarComputadora(Computadora computadora) throws SQLException {
        
        PreparedStatement ps = null;
        
        try {
            ps = conexion.prepareStatement("INSERT INTO computadora (codigo, marca, modelo) VALUES (?, ?, ?);");
            ps.setString(1, computadora.getCodigo());
            ps.setString(2, computadora.getMarca());
            ps.setString(3, computadora.getModelo());
            ps.executeUpdate();
            
            Long ultimaComputadora = ultimaComputadora();
            
            for (Componente c : computadora.getComponentes()) {
                PreparedStatement ps1 = conexion.prepareStatement("INSERT INTO componente (nombre, nroSerie, idComputadora) VALUES (?, ?, ?);");
                ps1.setString(1, c.getNombre());
                ps1.setString(2, c.getNroSerie());
                ps1.setLong(3, ultimaComputadora);
                ps1.executeUpdate();
            }
            
        } catch (SQLException ex) {
            conexion.rollback();
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally { 
            if (ps != null)
                ps.close();
        }
    }
    
    public Long ultimaComputadora() {
        ResultSet rs = null;
        
        try {
            Statement s = conexion.createStatement();
            rs = s.executeQuery("SELECT MAX(id) FROM computadora");
            int maximo = 0;
            while (rs.next()) {
                maximo = rs.getInt(1);
            }
            return new Long(maximo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
