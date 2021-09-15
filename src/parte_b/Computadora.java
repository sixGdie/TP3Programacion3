package parte_b;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Computadora extends EntityApp implements Serializable {

    private static final long serialVersionUID = 1L;
    
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

    @OneToMany(mappedBy = "computadora", cascade = CascadeType.ALL)
    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
    
}
