package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TeLesheo
 */
public class LicenciaDAO implements ILicenciaDAO {

    @Override
    public void agregarLicencia(Licencia licencia, Persona persona) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        
                

    }

    @Override
    public void consultarLicencia() {

    }
}
