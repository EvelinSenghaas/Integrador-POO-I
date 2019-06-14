
package sistema;

import Controlador.Controlador;
import Vistas.VistaPrincipal;
import controlador.Persistencia;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Integrador {

    public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("integradorPU");
          Persistencia p = new Persistencia(emf);
          Controlador c = new Controlador(p);
          VistaPrincipal v = new VistaPrincipal(c);
    }
}
