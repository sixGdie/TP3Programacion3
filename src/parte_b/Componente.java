package parte_b;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Componente extends EntityApp implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String nroSerie;
    private Computadora computadora;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcomputadora")
    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
}