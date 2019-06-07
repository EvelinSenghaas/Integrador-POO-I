
package modulo;

public class Persona {
    
     //esto es una prueba
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
