/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaNacimiento;

    @Column(name = "telefono", nullable = false, length = 30)
    private String telefono;

//    @OneToMany(mappedBy = "persona", cascade = CascadeType.PERSIST)
//    private List<Vehiculo> listaVehiculos;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Licencia> listaLicencias;

    public Persona() {
    }

    public Persona(String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String telefono) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Persona(String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String telefono, List<Licencia> listaLicencias) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.listaLicencias = listaLicencias;
    }

//    public Persona(String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String telefono, List<Licencias> listaLicencias) {
//        this.rfc = rfc;
//        this.nombres = nombres;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.fechaNacimiento = fechaNacimiento;
//        this.telefono = telefono;
//        this.listaLicencias = listaLicencias;
//    }
//    public Persona(String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String telefono, List<Vehiculo> listaVehiculos, List<Licencia> listaLicencias) {
//        this.rfc = rfc;
//        this.nombres = nombres;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.fechaNacimiento = fechaNacimiento;
//        this.telefono = telefono;
//        this.listaVehiculos = listaVehiculos;
//        this.listaLicencias = listaLicencias;
//    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Licencia> getListaLicencias() {
        return listaLicencias;
    }

    public void setListaLicencias(List<Licencia> listaLicencias) {
        this.listaLicencias = listaLicencias;
    }
    
    

}
