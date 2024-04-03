package com.mycompany.proyectobda2;

import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Automovil;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.EstadoPlaca;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.EstadoVehiculo;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Persona;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Placa;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Tramite;
import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Vehiculo;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author uirtis
 */
public class ProyectoBDA2 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        Calendar fechaNacimiento = Calendar.getInstance();
//        Calendar fechaRecepcion = Calendar.getInstance();
//        Calendar fechaEmision = Calendar.getInstance();
//        Calendar vigencia = Calendar.getInstance();
//        fechaNacimiento.set(2001, Calendar.MONTH, 10);
//        fechaRecepcion.set(2024, Calendar.MONTH, 24);
//        fechaEmision.set(2022, Calendar.MONTH, 30);
//        vigencia.set(2024, Calendar.MONTH, 2);
//
//        Persona persona = new Persona("ABCD123456XYZ", "ABCX123456XYZ789", fechaNacimiento, "1234567890", "Juan", "Pérez", "González", false);
//        Automovil automovil = new Automovil("V123456789", "Toyota", "Corolla", "Sedán", "Blanco", EstadoVehiculo.NUEVO, persona);
//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo.setId(automovil.getId());
//
//        Placa placa = new Placa(fechaRecepcion, "ABC123", EstadoPlaca.ACTIVO, vehiculo, fechaEmision, 300.00f, vigencia, persona);
//        Tramite tramite = new Tramite(fechaEmision, 100.50f, vigencia, persona);
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//        entityManager.persist(persona);
//        entityManager.persist(automovil);
//        entityManager.persist(placa);
//        entityManager.persist(tramite);
//
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        TypedQuery<Persona> query = em.createQuery(
//                "SELECT p FROM Persona p WHERE p.rfc LIKE :rfc", Persona.class);
//        query.setParameter("rfc", "%ABCX123456XYZ789%"); 
//        List<Persona> personas = query.getResultList();
//
//        em.getTransaction().commit();
//        em.close();
//        emf.close();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        String rfcBuscado = "ABCX123456XYZ789";// El rfc que queramos buscar

        TypedQuery<Persona> query = entityManager.createQuery(
                "SELECT p FROM Persona p WHERE p.rfc = :rfc", Persona.class);
        query.setParameter("rfc", rfcBuscado);
        List<Persona> personasConRFC = query.getResultList();

        for (Persona persona : personasConRFC) {
            System.out.println("Persona encontrada con RFC " + rfcBuscado + ": " + persona.getNombre());
        }

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
