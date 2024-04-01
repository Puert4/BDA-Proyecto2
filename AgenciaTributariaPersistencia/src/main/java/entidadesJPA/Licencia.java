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
public class Licencia implements Serializable {

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

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Persona persona;

    public Licencia() {
    }

    public Licencia(Double costo, Calendar vigencia, Calendar fechaEmision) {
        this.costo = costo;
        this.vigencia = vigencia;
        this.fechaEmision = fechaEmision;
    }

    public Licencia(Long id, Double costo, Calendar vigencia, Calendar fechaEmision) {
        this.id = id;
        this.costo = costo;
        this.vigencia = vigencia;
        this.fechaEmision = fechaEmision;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
