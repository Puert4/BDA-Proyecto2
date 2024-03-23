/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TeLesheo
 */
@Entity
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "color")
    private String color;
    
    @Column(name = "linea")
    private String linea;
    
    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "marca")
    private String marca;
    
    @Column(name = "serie_vehicular")
    private String serieVehicular;
    
    @Column(name = "estado_vehicular")
    private EstadoDeVehiculo estadoVehicular;

}
