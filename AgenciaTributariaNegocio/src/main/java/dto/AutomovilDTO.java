/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author TeLesheo
 */
public class AutomovilDTO {

    //color,linea,modelo,marca,serieVehicular,estadoVehicular
    private String color;
    private String linea;
    private String modelo;
    private String marca;
    private String serieVehicular;
    private String estadoVehicular;

    public AutomovilDTO() {
    }

    public AutomovilDTO(String color, String linea, String modelo, String marca, String serieVehicular, String estadoVehicular) {
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.marca = marca;
        this.serieVehicular = serieVehicular;
        this.estadoVehicular = estadoVehicular;
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

    public String getEstadoVehicular() {
        return estadoVehicular;
    }

    public void setEstadoVehicular(String estadoVehicular) {
        this.estadoVehicular = estadoVehicular;
    }

}
