
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Productor extends Persona {
    private int cantHectarea;
    
    @ManyToMany
    private List<Servicio> servicios = new ArrayList<>();
    
    @ManyToOne
    private List<ServicioCancelado> serviciosCancelados = new ArrayList<>();
    
    @ManyToMany
    private List<ServicioRealizado> serviciosRealizados = new ArrayList<>();
    

    
}
