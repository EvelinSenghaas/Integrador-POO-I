
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(" Prestador ")
class Prestador extends Persona{
    
    @ManyToMany
    private List<ZonaServicio> zona = new ArrayList<>(); 
    
    
    @ManyToOne 
    private List<ServicioCancelado> servicioCancelado = new ArrayList<>(); 
    
    @ManyToMany(mappedBy = "")
    private List<ServicioOfrecido> serviviosOfrecidos = new ArrayList<>();
    
    
}
