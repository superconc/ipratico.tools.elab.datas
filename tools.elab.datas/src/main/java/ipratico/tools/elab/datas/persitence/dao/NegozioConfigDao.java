package ipratico.tools.elab.datas.persitence.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ipratico.tools.elab.datas.persitence.EntityManagerFactoryProvider;
import ipratico.tools.elab.datas.persitence.beans.NegozioConfigEntity;

public class NegozioConfigDao {
	// Metodo per ottenere un'entità per ID
	public static Optional<NegozioConfigEntity> getById(Long id) {
		EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
		try {
			NegozioConfigEntity entity = entityManager.find(NegozioConfigEntity.class, id);
			return Optional.ofNullable(entity);
		} finally {
//			entityManager.close();
		}
	}

	// Metodo per ottenere tutte le entità
	public static List<NegozioConfigEntity> getAll() {
		EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
		try {
			return entityManager.createQuery("SELECT n FROM NegozioConfigBean n", NegozioConfigEntity.class)
					.getResultList();
		} finally {
//			entityManager.close();
		}
	}

	// Metodo per ottenere tutte le entità
	public static List<NegozioConfigEntity> getAllByStatus(String status) {
		EntityManager entityManager = EntityManagerFactoryProvider.getEntityManager();
		try {
			return entityManager.createQuery(
					"SELECT n FROM NegozioConfigBean n WHERE n.valid = :status order by n.nomeNegozio, n.idChiamata asc",
					NegozioConfigEntity.class).getResultList();
		} finally {
//			entityManager.close();
		}
	}

	// Metodo per aggiornare un'entità esistente
	public static void update(NegozioConfigEntity entity) {
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
			throw e; // Rilancia l'eccezione per gestirla a un livello superiore
		} finally {
//			entityManager.close();
		}
	}

	// Metodo per inserire una nuova entità
	public static void insert(NegozioConfigEntity entity) {
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
			throw e; // Rilancia l'eccezione per gestirla a un livello superiore
		} finally {
//			entityManager.close();
		}
	}
}
