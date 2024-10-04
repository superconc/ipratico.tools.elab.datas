package ipratico.tools.elab.datas.persitence.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ipratico.tools.elab.datas.persitence.EntityManagerFactoryProvider;
import ipratico.tools.elab.datas.persitence.beans.callJson.VatResumeEntity;


public class VatResumeDao {

    // Metodo per ottenere un'entità per ID
    public static Optional<VatResumeEntity> getById(Long id) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        try {
            VatResumeEntity entity = entityManager.find(VatResumeEntity.class, id);
            return Optional.ofNullable(entity);
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per ottenere tutte le entità
    public static List<VatResumeEntity> getAll() {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        try {
            return entityManager.createQuery("SELECT v FROM VatResume v", VatResumeEntity.class)
                    .getResultList();
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per aggiornare un'entità esistente
    public static void update(VatResumeEntity entity) {
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
    public static void insert(VatResumeEntity entity) {
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
