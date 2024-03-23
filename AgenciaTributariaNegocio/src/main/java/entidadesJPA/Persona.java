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
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rfc", nullable = false, length = 20)
    private String rfc;

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "apellido_paterno", nullable = false, length = 25)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false, length = 25)
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Calendar fechaNacimiento;

    @Column(name = "telefono", nullable = false, length = 30)
    private String telefono;
}
