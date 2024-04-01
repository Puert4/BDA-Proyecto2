package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;

/**
 *
 * @author TeLesheo
 */
public interface ILicenciaDAO {

    public void agregarLicencia(Licencia licencia, Persona persona);

    public void consultarLicencia();

}
