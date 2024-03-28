/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author TeLesheo
 */
@Entity
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "color", nullable = false, length = 100)
    private String color;

    @Column(name = "linea", nullable = false, length = 150)
    private String linea;

    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "serie_vehicular", nullable = false, length = 20)
    private String serieVehicular;

    @Column(name = "estado_vehicular", nullable = false)
    private EstadoDeVehiculo estadoVehicular;

    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.PERSIST)
    private List<Placas> listaPlacas;

    public Vehiculo() {
    }

    public Vehiculo(String color, String linea, String modelo, String marca, String serieVehicular, EstadoDeVehiculo estadoVehicular, List<Placas> listaPlacas) {
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.marca = marca;
        this.serieVehicular = serieVehicular;
        this.estadoVehicular = estadoVehicular;
        this.listaPlacas = listaPlacas;
    }

    public Vehiculo(Long id, String color, String linea, String modelo, String marca, String serieVehicular, EstadoDeVehiculo estadoVehicular, List<Placas> listaPlacas) {
        this.id = id;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.marca = marca;
        this.serieVehicular = serieVehicular;
        this.estadoVehicular = estadoVehicular;
        this.listaPlacas = listaPlacas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerieVehicular() {
        return serieVehicular;
    }

    public void setSerieVehicular(String serieVehicular) {
        this.serieVehicular = serieVehicular;
    }

    public EstadoDeVehiculo getEstadoVehicular() {
        return estadoVehicular;
    }

    public void setEstadoVehicular(EstadoDeVehiculo estadoVehicular) {
        this.estadoVehicular = estadoVehicular;
    }

    public List<Placas> getListaPlacas() {
        return listaPlacas;
    }

    public void setListaPlacas(List<Placas> listaPlacas) {
        this.listaPlacas = listaPlacas;
    }

}
