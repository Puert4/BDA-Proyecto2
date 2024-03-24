package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
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
public class Placas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "costo", nullable = false)
    private Double costo;

    @Column(name = "vigencia", nullable = false)
    private Calendar vigencia;

    @Column(name = "fecha_emision", nullable = false)
    private Calendar fechaEmision;
    
    @Column(name = "fecha_recepcion", nullable = false)
    private Calendar fechaRecepcion;
    
    @Column(name = "serie_placas", nullable = false)
    private String seriePlacas;
    
    
    
    
}
