
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
}
        
