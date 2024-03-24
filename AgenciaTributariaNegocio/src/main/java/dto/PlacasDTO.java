package dto;

import java.util.Calendar;

/**
 *
 * @author TeLesheo
 */
public class PlacasDTO {

    //cost,vigencia,fechaEmision,fechaRecepcion,seriePlacas
    private Double costo;
    private Calendar vigencia;
    private Calendar fechaEmision;
    private Calendar fechaRecepcion;
    private String seriePlacas;

    public PlacasDTO() {
    }

    public PlacasDTO(Double costo, Calendar vigencia, Calendar fechaEmision, Calendar fechaRecepcion, String seriePlacas) {
        this.costo = costo;
        this.vigencia = vigencia;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.seriePlacas = seriePlacas;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Calendar getVigencia() {
        return vigencia;
    }

    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getSeriePlacas() {
        return seriePlacas;
    }

    public void setSeriePlacas(String seriePlacas) {
        this.seriePlacas = seriePlacas;
    }

}
