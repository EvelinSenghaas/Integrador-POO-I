
package modulo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Prestador")
class Prestador extends Persona implements Serializable{
    
    @ManyToMany
    private List<ZonaServicio> zona = new ArrayList<>(); 
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioCancelado> servicioCancelado = new ArrayList<>(); 
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioOfrecido> serviviosOfrecidos = new ArrayList<>();

    public Prestador() {
    }

    public List<ZonaServicio> getZona() {
        return zona;
    }

    public void setZona(List<ZonaServicio> zona) {
        this.zona = zona;
    }

    public List<ServicioCancelado> getServicioCancelado() {
        return servicioCancelado;
    }

    public void setServicioCancelado(List<ServicioCancelado> servicioCancelado) {
        this.servicioCancelado = servicioCancelado;
    }

    public List<ServicioOfrecido> getServiviosOfrecidos() {
        return serviviosOfrecidos;
    }

    public void setServiviosOfrecidos(List<ServicioOfrecido> serviviosOfrecidos) {
        this.serviviosOfrecidos = serviviosOfrecidos;
    }
    
    
    
}
