
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Unidad {
    @Id
    @GeneratedValue
    private int idUnidad;
    private String descripcion;
    private double costo;
    
    @OneToMany(mappedBy = "unidad")
    private List<Servicio> servicioQuePertenece = new ArrayList<>();

    public Unidad() {
    }
   
    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
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

    public List<Servicio> getServicioQuePertenece() {
        return servicioQuePertenece;
    }

    public void setServicioQuePertenece(List<Servicio> servicioQuePertenece) {
        this.servicioQuePertenece = servicioQuePertenece;
    }
    
    
}
