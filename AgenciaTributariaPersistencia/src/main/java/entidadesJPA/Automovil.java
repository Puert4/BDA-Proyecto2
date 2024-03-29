package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TeLesheo
 */
@Entity
public class Automovil extends Vehiculo implements Serializable {

    public Automovil() {
    }

    public Automovil(String color, String linea, String modelo, String marca, String serieVehicular, EstadoDeVehiculo estadoVehicular, Persona persona) {
        super(color, linea, modelo, marca, serieVehicular, estadoVehicular, persona);
    }
    
    

}
