
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Unidad {
    @Id
    @GeneratedValue
    private int idUnidad;
    private String descripcion;
    private double costo;
    
    @OneToMany(mappedBy = "unidad")
    private List<Servicio> servicioQuePertenece = new ArrayList<>();
}
