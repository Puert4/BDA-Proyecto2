package entidadesJPA;

import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author TeLesheo
 */
public class pruebaJPA {

    public static void main(String[] args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        Calendar dob = Calendar.getInstance();
//        dob.set(1990, Calendar.JANUARY, 1);
//
//        Persona persona = new Persona("ABCD123456EFG", "John", "Doe", "Smith", dob, "1234567890");
//
//        Calendar dob1 = Calendar.getInstance();
//        dob1.set(1985, Calendar.MARCH, 15);
//        Persona persona1 = new Persona("ABCDE123456FGH", "Michael", "Johnson", "Brown", dob1, "9876543210");
//
//        Calendar dob2 = Calendar.getInstance();
//        dob2.set(1992, Calendar.JULY, 8);
//        Persona persona2 = new Persona("FGHI234567JKLM", "Emily", "Davis", "Wilson", dob2, "5678901234");
//
//        Calendar dob3 = Calendar.getInstance();
//        dob3.set(1988, Calendar.NOVEMBER, 25);
//        Persona persona3 = new Persona("KLMN345678OPQR", "David", "Anderson", "Martinez", dob3, "6789012345");
//
//        Calendar dob4 = Calendar.getInstance();
//        dob4.set(1996, Calendar.FEBRUARY, 10);
//        Persona persona4 = new Persona("STUV456789WXYZ", "Jessica", "Clark", "Rodriguez", dob4, "7890123456");
//
//        Calendar dob5 = Calendar.getInstance();
//        dob5.set(1983, Calendar.AUGUST, 4);
//        Persona persona5 = new Persona("12345ABCDEF678", "Christopher", "Taylor", "Garcia", dob5, "8901234567");
//
//        Calendar dob6 = Calendar.getInstance();
//        dob6.set(1991, Calendar.JUNE, 19);
//        Persona persona6 = new Persona("23456BCDEFG789", "Sarah", "Miller", "Lopez", dob6, "9012345678");
//
//        Calendar dob7 = Calendar.getInstance();
//        dob7.set(1980, Calendar.DECEMBER, 30);
//        Persona persona7 = new Persona("34567CDEFGH890", "Kevin", "Wilson", "Perez", dob7, "0123456789");
//
//        Calendar dob8 = Calendar.getInstance();
//        dob8.set(1987, Calendar.MAY, 12);
//        Persona persona8 = new Persona("45678DEFGHI901", "Amanda", "Hernandez", "Gonzalez", dob8, "1234567890");
//
//        Calendar dob9 = Calendar.getInstance();
//        dob9.set(1994, Calendar.OCTOBER, 6);
//        Persona persona9 = new Persona("56789EFGHIJ012", "Matthew", "Garcia", "Smith", dob9, "2345678901");
//
//        Calendar dob10 = Calendar.getInstance();
//        dob10.set(1982, Calendar.APRIL, 18);
//        Persona persona10 = new Persona("67890FGHIJK123", "Jennifer", "Brown", "Johnson", dob10, "3456789012");
//
//        Calendar dob11 = Calendar.getInstance();
//        dob11.set(1990, Calendar.JANUARY, 30);
//        Persona persona11 = new Persona("78901GHIJKL234", "Daniel", "Rodriguez", "Davis", dob11, "4567890123");
//
//        Calendar dob12 = Calendar.getInstance();
//        dob12.set(1989, Calendar.SEPTEMBER, 22);
//        Persona persona12 = new Persona("89012HIJKLM345", "Melissa", "Martinez", "Thomas", dob12, "5678901234");
//
//        Calendar dob13 = Calendar.getInstance();
//        dob13.set(1986, Calendar.JULY, 11);
//        Persona persona13 = new Persona("90123IJKLMN456", "Joshua", "Lee", "Clark", dob13, "6789012345");
//
//        Calendar dob14 = Calendar.getInstance();
//        dob14.set(1995, Calendar.MARCH, 26);
//        Persona persona14 = new Persona("01234JKLMNOP567", "Ashley", "Harris", "Miller", dob14, "7890123456");
//
//        Calendar dob15 = Calendar.getInstance();
//        dob15.set(1984, Calendar.NOVEMBER, 7);
//        Persona persona15 = new Persona("12345KLMNO678", "Brian", "King", "Anderson", dob15, "8901234567");
//
//        Calendar dob16 = Calendar.getInstance();
//        dob16.set(1993, Calendar.SEPTEMBER, 14);
//        Persona persona16 = new Persona("23456LMNOP789", "Lauren", "Perez", "Wilson", dob16, "9012345678");
//
//        Calendar dob17 = Calendar.getInstance();
//        dob17.set(1981, Calendar.JUNE, 3);
//        Persona persona17 = new Persona("34567MNOPQ890", "Ryan", "Gonzalez", "Taylor", dob17, "0123456789");
//
//        Calendar dob18 = Calendar.getInstance();
//        dob18.set(1988, Calendar.APRIL, 20);
//        Persona persona18 = new Persona("45678NOPQR901", "Stephanie", "Lopez", "Johnson", dob18, "1234567890");
//
//        Calendar dob19 = Calendar.getInstance();
//        dob19.set(1997, Calendar.AUGUST, 8);
//        Persona persona19 = new Persona("56789OPQRS012", "Justin", "Smith", "Hernandez", dob19, "2345678901");
//
//        em.persist(persona);
//        em.persist(persona1);
//        em.persist(persona2);
//        em.persist(persona3);
//        em.persist(persona4);
//        em.persist(persona5);
//        em.persist(persona6);
//        em.persist(persona7);
//        em.persist(persona8);
//        em.persist(persona9);
//        em.persist(persona10);
//        em.persist(persona11);
//        em.persist(persona12);
//        em.persist(persona13);
//        em.persist(persona14);
//        em.persist(persona15);
//        em.persist(persona16);
//        em.persist(persona17);
//        em.persist(persona18);
//        em.persist(persona19);
//
//        tx.commit();
//        em.close();
//        emf.close();
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
//        EntityManager em = emf.createEntityManager();
//
//        Calendar dob19 = Calendar.getInstance();
//        dob19.set(1997, Calendar.AUGUST, 8);
//        Persona persona = new Persona("132456", "Jullian  Herlenn", "Puerta", "Ramirez", dob19, "6441613092");
//
//        Licencia licencia = new Licencia();
//        licencia.setCosto(100.0);
//        Calendar vigencia = Calendar.getInstance();
//        vigencia.set(2025, Calendar.DECEMBER, 31); // Establecer la vigencia hasta el 31 de diciembre de 2025
//        licencia.setVigencia(vigencia);
//        Calendar fechaEmision = Calendar.getInstance();
//        licencia.setFechaEmision(fechaEmision);
//
//        // Asignar la licencia a la persona
//        persona.setListaLicencias(Collections.singletonList(licencia));
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        em.persist(persona);
//        tx.commit();
//        em.close();
//        emf.close();
        // Crear una fábrica de gestores de entidad usando la unidad de persistencia definida en persistence.xml
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");

        // Obtener un gestor de entidad desde la fábrica
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Iniciar una transacción
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            // Crear una persona
            Persona persona = new Persona("RFC123", "Juan", "Perez", "Gomez", Calendar.getInstance(), "1234567890");

            // Crear un vehículo
            Vehiculo vehiculo = new Vehiculo("Azul", "Sport", "2022", "Toyota", "123456", EstadoDeVehiculo.NUEVO, persona);

            // Guardar la persona y el vehículo en la base de datos
            entityManager.persist(persona);
            entityManager.persist(vehiculo);

            // Realizar la asociación entre la persona y el vehículo
            persona.getListaVehiculos().add(vehiculo);
            vehiculo.setPersona(persona);
            System.out.println("Aqui esta el estado: "+vehiculo.getEstadoVehicular());

            // Confirmar la transacción
            transaction.commit();
        } catch (Exception e) {
            // En caso de error, hacer rollback
            if (transaction.isActive()) {
                transaction.rollback();
                
            }
            e.printStackTrace();
        } finally {
            // Cerrar el gestor de entidad
            entityManager.close();
        }

        // Cerrar la fábrica de gestores de entidad
        entityManagerFactory.close();

    }

}
