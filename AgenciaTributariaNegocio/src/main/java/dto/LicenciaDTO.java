package dto;

import java.util.Calendar;

/**
 *
 * @author TeLesheo
 */
public class LicenciaDTO {

    private Double costo;
    private Calendar vigencia;
    private Calendar fechaEmision;

    public LicenciaDTO() {
    }

    public LicenciaDTO(Double costo, Calendar vigencia, Calendar fechaEmision) {
        this.costo = costo;
        this.vigencia = vigencia;
        this.fechaEmision = fechaEmision;
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

}
