package com.mycompany.agenciatributarianegocio.control;

import com.mycompany.agenciatributariapresentacion.LicenciaLlenadoDatos;
import com.mycompany.agenciatributariapresentacion.PaginaInicio;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Persona;

import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author JESUS
 */
public class control implements Icontrol {

    @Override
    public void inicioSesion(String usuario, String contraseña, Icontrol control) {

        if (usuario.equalsIgnoreCase("admin") && contraseña.equalsIgnoreCase("1234")) {
            PaginaInicio frmInicio = new PaginaInicio(control);
            frmInicio.setVisible(true);
            JOptionPane.showMessageDialog(frmInicio, "Inicio de sesion exitoso", "!! EXITOSO ¡¡", JOptionPane.INFORMATION_MESSAGE);
        } else if (!usuario.equalsIgnoreCase("admin")) {
            JOptionPane.showMessageDialog(null, "El usuario es incorrecta", "!! ALERTA ¡¡", JOptionPane.ERROR_MESSAGE);
        } else if (!contraseña.equalsIgnoreCase("1234")) {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta", "!! ALERTA ¡¡", JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public void agregaPersonas() {
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            // Crear un objeto Calendar para cada fecha de nacimiento
            Calendar fechaNacimiento1 = Calendar.getInstance();
            fechaNacimiento1.set(1990, Calendar.JANUARY, 1);

            Calendar fechaNacimiento2 = Calendar.getInstance();
            fechaNacimiento2.set(1985, Calendar.MARCH, 15);

            Calendar fechaNacimiento3 = Calendar.getInstance();
            fechaNacimiento3.set(1978, Calendar.DECEMBER, 5);

            Calendar fechaNacimiento4 = Calendar.getInstance();
            fechaNacimiento4.set(1989, Calendar.AUGUST, 20);

            Calendar fechaNacimiento5 = Calendar.getInstance();
            fechaNacimiento5.set(1995, Calendar.MAY, 10);

            Calendar fechaNacimiento6 = Calendar.getInstance();
            fechaNacimiento6.set(1980, Calendar.JUNE, 25);

            Calendar fechaNacimiento7 = Calendar.getInstance();
            fechaNacimiento7.set(1973, Calendar.OCTOBER, 3);

            Calendar fechaNacimiento8 = Calendar.getInstance();
            fechaNacimiento8.set(1987, Calendar.APRIL, 12);

            Calendar fechaNacimiento9 = Calendar.getInstance();
            fechaNacimiento9.set(1992, Calendar.FEBRUARY, 18);

            Calendar fechaNacimiento10 = Calendar.getInstance();
            fechaNacimiento10.set(1975, Calendar.NOVEMBER, 28);

            Calendar fechaNacimiento11 = Calendar.getInstance();
            fechaNacimiento11.set(1983, Calendar.SEPTEMBER, 8);

            Calendar fechaNacimiento12 = Calendar.getInstance();
            fechaNacimiento12.set(1971, Calendar.JULY, 17);

            Calendar fechaNacimiento13 = Calendar.getInstance();
            fechaNacimiento13.set(1998, Calendar.JANUARY, 30);

            Calendar fechaNacimiento14 = Calendar.getInstance();
            fechaNacimiento14.set(1993, Calendar.JUNE, 4);

            Calendar fechaNacimiento15 = Calendar.getInstance();
            fechaNacimiento15.set(1976, Calendar.MARCH, 21);

            Calendar fechaNacimiento16 = Calendar.getInstance();
            fechaNacimiento16.set(1986, Calendar.AUGUST, 9);

            Calendar fechaNacimiento17 = Calendar.getInstance();
            fechaNacimiento17.set(1991, Calendar.APRIL, 14);

            Calendar fechaNacimiento18 = Calendar.getInstance();
            fechaNacimiento18.set(1979, Calendar.JULY, 27);

            Calendar fechaNacimiento19 = Calendar.getInstance();
            fechaNacimiento19.set(1982, Calendar.MAY, 6);

            Calendar fechaNacimiento20 = Calendar.getInstance();
            fechaNacimiento20.set(1997, Calendar.OCTOBER, 23);

            Persona persona1 = new Persona("ABCD123456MNXYYY01", "ABCD123456MNY", fechaNacimiento1, "1234567890", "Juan", "García", "Rodríguez", false);
            Persona persona2 = new Persona("EFGH123456ABCXXX02", "EFGH123456ABC", fechaNacimiento2, "9876543210", "María", "Martínez", "Fernández", false);
            Persona persona3 = new Persona("IJKL123456OPRZZZ03", "IJKL123456OPR", fechaNacimiento3, "5555555555", "José", "Hernández", "López", false);
            Persona persona4 = new Persona("QRST123456UVWYYY04", "QRST123456UVW", fechaNacimiento4, "9998887777", "Ana", "López", "González", false);
            Persona persona5 = new Persona("XYZW123456QRSWWW05", "XYZW123456QRS", fechaNacimiento5, "3332221111", "Pedro", "González", "Díaz", false);
            Persona persona6 = new Persona("ABCDE123456MNXYYY06", "ABCDE123456MNY", fechaNacimiento6, "4443332222", "Laura", "Pérez", "Martínez", false);
            Persona persona7 = new Persona("FGHIJ123456ABCXXX07", "FGHIJ123456ABC", fechaNacimiento7, "6665554444", "Diego", "Sánchez", "Hernández", false);
            Persona persona8 = new Persona("KLMNO123456OPRZZZ08", "KLMNO123456OPR", fechaNacimiento8, "7776665555", "Sofía", "Ramírez", "Pérez", false);
            Persona persona9 = new Persona("PQRST123456UVWYYY09", "PQRST123456UVW", fechaNacimiento9, "8887776666", "Carlos", "Torres", "Sánchez", false);
            Persona persona10 = new Persona("XYZAB123456QRSWWW10", "XYZAB123456QRS", fechaNacimiento10, "1112223333", "Luis", "Flores", "Torres", false);
            Persona persona11 = new Persona("UVWXY123456MNXYYY11", "UVWXY123456MNY", fechaNacimiento11, "2223334444", "Elena", "Gómez", "Ramírez", true);
            Persona persona12 = new Persona("LMNOP123456ABCXXX12", "LMNOP123456ABC", fechaNacimiento12, "5554443333", "Miguel", "Jiménez", "Fernández", true);
            Persona persona13 = new Persona("QRSTU123456OPRZZZ13", "QRSTU123456OPR", fechaNacimiento13, "7778889999", "Carmen", "Cruz", "Martínez", true);
            Persona persona14 = new Persona("FGHIJ123456UVWYYY14", "FGHIJ123456UVW", fechaNacimiento14, "7778889999", "Carmen", "Cruz", "Martínez", true);
            Persona persona15 = new Persona("KLMNO123456QRSWWW15", "KLMNO123456QRS", fechaNacimiento15, "6667778888", "Javier", "Hernández", "Pérez", true);
            Persona persona16 = new Persona("PQRST123456MNXYYY16", "PQRST123456MNY", fechaNacimiento16, "3334445555", "Isabel", "Sánchez", "López", true);
            Persona persona17 = new Persona("LMNOP123456ABCXXX17", "LMNOP123456ABC", fechaNacimiento17, "2223334444", "Roberto", "Gómez", "Ramírez", true);
            Persona persona18 = new Persona("QRSTU123456OPRZZZ18", "QRSTU123456OPR", fechaNacimiento18, "5556667777", "Fernanda", "Jiménez", "Fernández", true);
            Persona persona19 = new Persona("FGHIJ123456UVWYYY19", "FGHIJ123456UVW", fechaNacimiento19, "8889990000", "Ricardo", "Ruiz", "García", true);
            Persona persona20 = new Persona("KLMNO123456QRSWWW20", "KLMNO123456QRS", fechaNacimiento20, "7778889999", "Sara", "Cruz", "Martínez", true);

            em.persist(persona1);
            em.persist(persona2);
            em.persist(persona3);
            em.persist(persona4);
            em.persist(persona5);
            em.persist(persona6);
            em.persist(persona7);
            em.persist(persona8);
            em.persist(persona9);
            em.persist(persona10);
            em.persist(persona11);
            em.persist(persona12);
            em.persist(persona13);
            em.persist(persona14);
            em.persist(persona15);
            em.persist(persona16);
            em.persist(persona17);
            em.persist(persona18);
            em.persist(persona19);
            em.persist(persona20);

            em.getTransaction().commit();
            em.close();
            emf.close();
            JOptionPane.showMessageDialog(null, "Se ha agregado 20 personas", "!! EXITO ¡¡", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido agregar a las personas", "", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @Override
    public void registrarLicencia() {
        LicenciaLlenadoDatos frmLicencias = new LicenciaLlenadoDatos();
        frmLicencias.setVisible(true);
        if (frmLicencias.cambioBoton()) {
            System.out.println("das" + frmLicencias.rfc());
        }

    }

}
