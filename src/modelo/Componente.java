package modelo;

public class Componente {

    private long id;
    private String nombre;
    private String nroSerie;

    public Componente() {
    }

    public Componente(String nombre, String nroSerie) {
        this.nombre = nombre;
        this.nroSerie = nroSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
