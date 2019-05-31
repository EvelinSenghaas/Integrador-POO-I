
package modulo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;


@Entity
public class Servicio {
    @Id
    @SequenceGenerator (name = "id_Servicio", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Servicio")
    private int idServicio;
    private String descripcion;
    private double costo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @OneToMany(mappedBy = "servicioQuePertenece")
    private Unidad unidad;
    
    @OneToMany(mappedBy = "servicios")
    private TipoServicio tipoServio;
    @ManyToOne
    private List<ServicioRealizado> servicioRealizado = new ArrayList<>();
    
    
    
    @ManyToMany
    private List<Productor> productores = new ArrayList<>(); 
    
    
    public Servicio(){
    }
    
    
    
}
