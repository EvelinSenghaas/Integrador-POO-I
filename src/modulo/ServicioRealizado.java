
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class ServicioRealizado {
    @Id
    @SequenceGenerator (name = "idEstado", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idEstado")
    private int idEstado;
    private String descripcion;
    private String puntaje;
    
    @ManyToMany
    private List<Productor> productores = new ArrayList<>();
    
    @OneToMany(mappedBy = "servicioRealizado")
    private Servicio servicio;
   
    public ServicioRealizado(){
    
    }
    
}
