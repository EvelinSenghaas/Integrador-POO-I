
package modulo;

<<<<<<< HEAD
public class Persona {
    
     //esto es una prueba
=======
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo de Persona")
public class Persona {
    @Id
    @GeneratedValue
>>>>>>> 657f6558a8a98e935ba5f803e899ad7100829678
    private long cuit;
    
    private String razonSocial;
    private int nroInscripcion;
    private String domicilioLegal;
    
    public Persona(){
 
    }

    public Persona(long cuit, String razonSocial, int nroInscripcion, String domicilioLegal) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nroInscripcion = nroInscripcion;
        this.domicilioLegal = domicilioLegal;
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
