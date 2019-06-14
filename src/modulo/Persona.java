
package modulo;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipoPersona")
public abstract class Persona {

    @Id
    @GeneratedValue
    private long cuit;
    
    private String razonSocial;
    private int nroInscripcion;
    private String domicilioLegal;
    
    public Persona(){
 
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNroInscripcion() {
        return nroInscripcion;
    }

    public void setNroInscripcion(int nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }

    public String getDomicilioLegal() {
        return domicilioLegal;
    }

    public void setDomicilioLegal(String domicilioLegal) {
        this.domicilioLegal = domicilioLegal;
    }
    
}