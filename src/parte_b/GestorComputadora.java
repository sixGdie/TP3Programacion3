package parte_b;

public class GestorComputadora extends Gestor {

    public GestorComputadora() {
        sesion = ConfigHibernate.openSession();
    }
    
}
