package ipratico.tools.elab.datas.main;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ipratico.tools.elab.datas.persitence.entities.prova.Automobile;
import ipratico.tools.elab.datas.persitence.entities.prova.Multa;
import ipratico.tools.elab.datas.persitence.entities.prova.Persona;

public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-postgres");
        EntityManager em = emf.createEntityManager();

        // Avvio di una transazione
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
            // Creazione delle entità
            Persona persona = new Persona();
            persona.setNome("Mario");
            persona.setCognome("Rossi");

            Automobile auto1 = new Automobile();
            auto1.setMarca("Fiat");
            auto1.setModello("500");
            auto1.setPersona(persona);

            Automobile auto2 = new Automobile();
            auto2.setMarca("Peugeot");
            auto2.setModello("208");
            auto2.setPersona(persona);

            Multa multa1 = new Multa();
            multa1.setDescrizione("Eccesso di velocità");
            multa1.setImporto(new BigDecimal("150.00"));
            multa1.setAutomobile(auto1);

            Multa multa2 = new Multa();
            multa2.setDescrizione("Parcheggio in divieto di sosta");
            multa2.setImporto(new BigDecimal("80.00"));
            multa2.setAutomobile(auto2);

            // Aggiunta delle automobili alla persona
            persona.getAutomobili().add(auto1);
            persona.getAutomobili().add(auto2);

            // Aggiunta delle multe alle automobili
            auto1.getMulte().add(multa1);
            auto2.getMulte().add(multa2);

            // Salvataggio delle entità
            em.persist(persona);
            em.persist(auto1);
            em.persist(auto2);
            em.persist(multa1);
            em.persist(multa2);

            // Commit della transazione
            transaction.commit();
        } catch (RuntimeException e) {
            // In caso di errore, rollback della transazione
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            // Chiusura dell'EntityManager
            em.close();
        }

        // Chiusura dell'EntityManagerFactory
        emf.close();
    }
}

