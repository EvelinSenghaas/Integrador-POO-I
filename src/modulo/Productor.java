
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
    
    @OneToMany (mappedBy = "productor")
    private List<ServicioRealizado> serviciosRealizados = new ArrayList<>();

    public Productor() {
    }

    public int getCantHectarea() {
        return cantHectarea;
    }

    public void setCantHectarea(int cantHectarea) {
        this.cantHectarea = cantHectarea;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<ServicioCancelado> getServiciosCancelados() {
        return serviciosCancelados;
    }

    public void setServiciosCancelados(List<ServicioCancelado> serviciosCancelados) {
        this.serviciosCancelados = serviciosCancelados;
    }

    public List<ServicioRealizado> getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void setServiciosRealizados(List<ServicioRealizado> serviciosRealizados) {
        this.serviciosRealizados = serviciosRealizados;
    }
    

    
}
