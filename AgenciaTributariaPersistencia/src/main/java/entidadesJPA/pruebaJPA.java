package entidadesJPA;

import java.util.Calendar;
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

//        // Create EntityManagerFactory and EntityManager
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        // Create a new Persona object
//        Calendar fechaNacimiento = new GregorianCalendar(1990, Calendar.JANUARY, 1); // Example birth date: January 1, 1990
//
//        Persona persona = new Persona("ABC123456DEF", "John", "Doe", "Smith", fechaNacimiento, "1234567890");
//
//        // Start a transaction
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        // Persist the Persona object
//        entityManager.persist(persona);
//
//        // Commit the transaction
//        transaction.commit();
//
//        // Close EntityManager and EntityManagerFactory
//        entityManager.close();
//        entityManagerFactory.close();
        // Create an EntityManagerFactory based on the persistence unit defined in persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");

        // Create an EntityManager
        EntityManager em = emf.createEntityManager();

        // Begin a transaction
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Set the date of birth
        Calendar dob = Calendar.getInstance();
        dob.set(1990, Calendar.JANUARY, 1);

        // Create a new Persona object
        Persona persona = new Persona("ABCD123456EFG", "John", "Doe", "Smith", dob, "1234567890");
//            persona.setRfc("ABCD123456EFG");
//            persona.setNombres("John");
//            persona.setApellidoPaterno("Doe");
//            persona.setApellidoMaterno("Smith");
//
//   
//
//            persona.setTelefono("1234567890");

        // Persist the Persona object
        em.persist(persona);

        // Commit the transaction
        tx.commit();

        em.close();
        emf.close();

    }

}
