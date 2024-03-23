package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
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

    private Double costo;

    private Calendar vigencia;

    private Calendar fechaEmision;
    
    private Calendar fechaRecepcion;
    
    private String seriePlacas;
    
    
}