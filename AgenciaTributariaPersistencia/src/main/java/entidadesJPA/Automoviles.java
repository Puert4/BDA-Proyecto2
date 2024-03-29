/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
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
public class Automoviles extends Vehiculo implements Serializable {

    public Automoviles() {
    }

    public Automoviles(String color, String linea, String modelo, String marca, String serieVehicular, EstadoDeVehiculo estadoVehicular, Persona persona) {
        super(color, linea, modelo, marca, serieVehicular, estadoVehicular, persona);
    }

  


    
}
