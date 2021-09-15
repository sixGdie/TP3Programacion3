package parte_a;

import parte_a.Gestor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import parte_a.Componente;
import parte_a.Computadora;

public class TP3Programacion3a {

    public static void main(String[] args) throws SQLException {
        
        Computadora computadora = new Computadora();
        Gestor gestor = new Gestor();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("===================\nDatos Computadora\n===================");
        System.out.println("Código:");
        computadora.setCodigo(sc.next());
        System.out.println("Marca:");
        computadora.setMarca(sc.next());
        System.out.println("Modelo:");
        computadora.setModelo(sc.next());
        
        List<Componente> componentes = new ArrayList<>();
        
        while (true) {
            Componente componente = new Componente();
            System.out.println("===================\nDatos Componente\n===================");
            System.out.println("Nombre:");
            componente.setNombre(sc.next());
            System.out.println("N° serie:");
            componente.setNroSerie(sc.next());
            componentes.add(componente);
            
            System.out.println("¿Desea seguir agregando componentes ? N para salir, Y para continuar...");
            String salida = sc.next();
            if (salida.equalsIgnoreCase("Y")) {
                continue;
            } else if (salida.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        computadora.setComponentes(componentes);
        gestor.agregarComputadora(computadora);
        gestor.cerrarConexion();
        
    }
    
}
