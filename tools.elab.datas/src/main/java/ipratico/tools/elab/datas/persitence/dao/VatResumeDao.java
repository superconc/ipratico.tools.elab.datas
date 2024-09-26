package ipratico.tools.elab.datas.persitence.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ipratico.tools.elab.datas.persitence.EntityManagerFactoryProvider;
import ipratico.tools.elab.datas.persitence.beans.callJson.VatResume;


public class VatResumeDao {

    // Metodo per ottenere un'entità per ID
    public static Optional<VatResume> getById(Long id) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        try {
            VatResume entity = entityManager.find(VatResume.class, id);
            return Optional.ofNullable(entity);
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per ottenere tutte le entità
    public static List<VatResume> getAll() {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        try {
            return entityManager.createQuery("SELECT v FROM VatResume v", VatResume.class)
                    .getResultList();
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per aggiornare un'entità esistente
    public static void update(VatResume entity) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per inserire una nuova entità
    public static void insert(VatResume entity) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            // entityManager.close();
        }
    }
}
