package com.mycompany.proyectobda2;

import com.mycompany.proyectobda2.Persistencia.EntidadesJPA.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author TeLesheo
 */
public class PruebasConsultas {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<Persona> query = em.createQuery(
                "SELECT p FROM Persona p WHERE p.rfc LIKE :rfc", Persona.class);
        query.setParameter("rfc", "%ABCX123456XYZ789%"); 
        List<Persona> personas = query.getResultList();

        em.getTransaction().commit();
        em.close();
        emf.close();

    }

}
