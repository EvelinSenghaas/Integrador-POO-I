
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(" Prestador ")
class Prestador extends Persona{
    
    @ManyToMany
    private List<ZonaServicio> zona = new ArrayList<>(); 
    
    
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioCancelado> servicioCancelado = new ArrayList<>(); 
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioOfrecido> serviviosOfrecidos = new ArrayList<>();
    
    
}
