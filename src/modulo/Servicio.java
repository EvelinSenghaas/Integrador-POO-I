
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;


@Entity
public class Servicio {
    //comentario de prueba
    @Id
    @SequenceGenerator (name = "id_Servicio", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Servicio")
    private int idServicio;
    
    private String descripcion;
    
    private double costo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne
    private Unidad unidad;
    
    @ManyToOne
    private TipoServicio tipoServicio;
    
    @OneToOne
    private ServicioRealizado serviRealizado;
    
    
    
    @ManyToOne
    private Productor productor; 
    
    
    public Servicio(){
    }
    
    
    
}
