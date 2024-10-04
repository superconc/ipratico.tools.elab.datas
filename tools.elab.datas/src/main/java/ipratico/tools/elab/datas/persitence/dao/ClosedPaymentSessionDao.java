package ipratico.tools.elab.datas.persitence.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import ipratico.tools.elab.datas.persitence.EntityManagerFactoryProvider;
import ipratico.tools.elab.datas.persitence.beans.callJson.ClosedPaymentSessionEntity;

public class ClosedPaymentSessionDao {

    // Metodo per ottenere un'entità per ID
    public static Optional<ClosedPaymentSessionEntity> getById(Long id) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        try {
            ClosedPaymentSessionEntity entity = entityManager.find(ClosedPaymentSessionEntity.class, id);
            return Optional.ofNullable(entity);
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per ottenere tutte le entità
    public static List<ClosedPaymentSessionEntity> getAll() {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
        try {
            return entityManager.createQuery("SELECT c FROM ClosedPaymentSession c", ClosedPaymentSessionEntity.class)
                    .getResultList();
        } finally {
            // entityManager.close();
        }
    }

    // Metodo per aggiornare un'entità esistente
    public static void update(ClosedPaymentSessionEntity entity) {
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
    public static void insert(ClosedPaymentSessionEntity entity) {
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
