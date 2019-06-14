
package modulo;

import java.util.ArrayList;
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

@Entity
public class ServicioRealizado {
    @Id
    @SequenceGenerator (name = "idEstado", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idEstado")
    private int idEstado;
    private String descripcion;
    private String puntaje;
    
    @ManyToOne
    private Productor productor;
    
    @OneToOne(mappedBy = "serviRealizado")
    private Servicio servicio;
   
    public ServicioRealizado(){
    
    }
    
}
