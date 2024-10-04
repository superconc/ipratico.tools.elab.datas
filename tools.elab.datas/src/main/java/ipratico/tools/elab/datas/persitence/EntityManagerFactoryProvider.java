package ipratico.tools.elab.datas.persitence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {
	private static EntityManagerFactory entityManagerFactory;

    // Inizializzazione dell'EntityManagerFactory
    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnitSQL");
        } catch (Throwable ex) {
            // Gestire l'errore di inizializzazione
            throw new ExceptionInInitializerError("Impossibile creare l'EntityManagerFactory: " + ex.getMessage());
        }
    }

    // Metodo per ottenere un EntityManager
    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null) {
            throw new IllegalStateException("EntityManagerFactory non è stato inizializzato");
        }
        return entityManagerFactory.createEntityManager();
    }

    // Metodo per chiudere l'EntityManagerFactory
    public static void close() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
