
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Unidad {
    @Id
    @GeneratedValue
    private int idUnidad;
    private String descripcion;
    private double costo;
    
    @ManyToOne
    private List<Servicio> servicioQuePertenece = new ArrayList<>();
}
