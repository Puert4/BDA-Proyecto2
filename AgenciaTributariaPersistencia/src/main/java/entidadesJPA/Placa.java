package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author TeLesheo
 */
@Entity
public class Placa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "costo", nullable = false)
    private Double costo;

    @Column(name = "vigencia", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar vigencia;

    @Column(name = "fecha_emision", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaEmision;

    @Column(name = "fecha_recepcion", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaRecepcion;

    @Column(name = "serie_placas", nullable = false)
    private String seriePlacas;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private Vehiculo vehiculo;

    public Placa() {
    }

    public Placa(Double costo, Calendar vigencia, Calendar fechaEmision, Calendar fechaRecepcion, String seriePlacas, Vehiculo vehiculo) {
        this.costo = costo;
        this.vigencia = vigencia;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.seriePlacas = seriePlacas;
        this.vehiculo = vehiculo;
    }

    public Long getId() {
        return id;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
