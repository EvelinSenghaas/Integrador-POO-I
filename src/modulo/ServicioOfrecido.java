
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class ServicioOfrecido {
    @Id
    @SequenceGenerator (name = "idServicioOfrecido", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idServicioOfrecido")
    private int idServicioOfrecido;
    private double costoPorPrestador;
    
    @ManyToMany
    private List<Prestador> prestadores = new ArrayList<>();
    
    @OneToMany(mappedBy = "serviciosOfrecidos")
    private TipoServicio tiposervicio;
    
        
}
