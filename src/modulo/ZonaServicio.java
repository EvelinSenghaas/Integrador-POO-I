
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ZonaServicio {
    @Id
    @GeneratedValue
    private int idZona;
    private String descripcion;
    
    @ManyToMany
    private List<Prestador> prestadores = new ArrayList<>();
}
        
