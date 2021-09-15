package parte_b;

import javax.persistence.*;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class EntityApp {

    private long id;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
}
