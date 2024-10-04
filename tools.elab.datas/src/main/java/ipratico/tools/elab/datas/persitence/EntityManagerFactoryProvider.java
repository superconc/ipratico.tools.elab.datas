package ipratico.tools.elab.datas.persitence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityManagerFactoryProvider {
	public static EntityManagerFactory entityManagerFactory;
	
	
	private static final Logger logger = LoggerFactory.getLogger(EntityManagerFactoryProvider.class);

    // Inizializzazione dell'EntityManagerFactory
    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("pu-postgres");
        } catch (Throwable ex) {
            // Gestire l'errore di inizializzazione
        	logger.error(null, ex);
//        	error("eccezione", ex.printStackTrace());
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
