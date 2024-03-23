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
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rfc;

    private String nombres;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private Calendar fechaNacimiento;

    private String telefono;
}
