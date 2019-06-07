
package sistema;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Integrador {

    public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("integradorPU");
          EntityManager em = emf.createEntityManager();
    
    }
}
