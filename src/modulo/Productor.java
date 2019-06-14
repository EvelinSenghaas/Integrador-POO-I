
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Productor")
public class Productor extends Persona {
    private int cantHectarea;
    
    @OneToMany (mappedBy = "productor")
    private List<Servicio> servicios = new ArrayList<>();
    
    @OneToMany(mappedBy = "productor")
    private List<ServicioCancelado> serviciosCancelados = new ArrayList<>();
    
    @OneToMany
    private List<ServicioRealizado> serviciosRealizados = new ArrayList<>();
    

    
}
