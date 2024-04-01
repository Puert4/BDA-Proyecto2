package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author TeLesheo
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Automovil extends Vehiculo implements Serializable {

    public Automovil() {
    }

    public Automovil(String color, String linea, String modelo, String marca, String serieVehicular, EstadoDeVehiculo estadoVehicular, Persona persona) {
        super(color, linea, modelo, marca, serieVehicular, estadoVehicular, persona);
    }

//    public Automovil(String color, String linea, String modelo, String marca, String serieVehicular, EstadoDeVehiculo estadoVehicular, Persona persona, List<Placa> placas) {
//        super(color, linea, modelo, marca, serieVehicular, estadoVehicular, persona, placas);
//    }

}
