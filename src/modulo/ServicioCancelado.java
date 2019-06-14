
package modulo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class ServicioCancelado {
    @Id
    @SequenceGenerator (name = "idServicioCancaledo", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idServicioCancaledo")
    private int idServicioCancaledo;
    
    private String causa;
    
    private double TotalAPagar;
    
    @ManyToOne 
    private Productor productor;
    
    @ManyToOne
    private Prestador prestador;

    public ServicioCancelado() {
    }

    public int getIdServicioCancaledo() {
        return idServicioCancaledo;
    }

    public void setIdServicioCancaledo(int idServicioCancaledo) {
        this.idServicioCancaledo = idServicioCancaledo;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public double getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(double TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }
    
    
}
        
