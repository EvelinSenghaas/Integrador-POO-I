
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
    
    @OneToMany(mappedBy = "servicio")
    private Prestador prestador;
    
    @ManyToMany
    private List<Productor> productores = new ArrayList<>(); 
    
    
    public Servicio(){
    }
    
    public Servicio(int idServicio, String descripcion, double costo, Date fecha, String estado) {
        this.idServicio = idServicio;
        this.descripcion = descripcion;
        this.costo = costo;
        this.fecha = fecha;
        this.unidad = unidad;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
    

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

 
    
    
    
}
