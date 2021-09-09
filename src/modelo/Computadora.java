package modelo;

import java.util.List;

public class Computadora {
    
    private long id;
    private String codigo;
    private String marca;
    private String modelo;
    private List<Componente> componentes;

    public Computadora() {
    }

    public Computadora(String codigo, String marca, String modelo, List<Componente> componentes) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = componentes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
