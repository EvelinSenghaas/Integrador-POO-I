/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Facu
 */
@Entity
public class TipoServicio {
    @Id
    @GeneratedValue
    private int idServi;
    private String descripcion;
    
    @OneToMany (mappedBy = "tipoServicio")
    private List<Servicio> servicios;
    
    @OneToMany(mappedBy = "tipoServicio")
    private List<ServicioOfrecido> serviciosOfrecidos = new ArrayList<>();
    
    public TipoServicio (){
        this.servicios = new ArrayList<>();
    
    }

    public TipoServicio(int idServi, String descripcion) {
        this.servicios = new ArrayList<>();
        this.idServi = idServi;
        this.descripcion = descripcion;
    }

    public int getIdServi() {
        return idServi;
    }

    public void setIdServi(int idServi) {
        this.idServi = idServi;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    
        
    
}
