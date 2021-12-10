package com.developper.sistemascurso.servicies;


import com.developper.sistemascurso.model.Curso;
import com.developper.sistemascurso.model.Modulo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Relacionamentos {
    public static void main(String[] args){
        String persistenceUnitName;
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory(persistenceUnitName = "Cursos-PU");
        EntityManager entityManager =entityManagerFactory.createEntityManager();

        Curso curso = new Curso();
        curso.setName("Especialidades em JPA");

        Modulo modulo = new Modulo();
        modulo.setName("Introdução JPA");
        modulo.setCurso(curso);

        entityManager.getTransaction().begin();

        entityManager.persist(curso);
        entityManager.persist(modulo);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
