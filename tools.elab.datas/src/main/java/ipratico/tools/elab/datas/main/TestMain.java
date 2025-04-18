package ipratico.tools.elab.datas.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;

import ipratico.tools.elab.datas.persitence.entities.prova.Automobile;
import ipratico.tools.elab.datas.persitence.entities.prova.Multa;
import ipratico.tools.elab.datas.persitence.entities.prova.Persona;

public class TestMain {
	
	public static void main(String[] args) {
        // Creazione della configurazione di Hibernate
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Persona.class);
        cfg.addAnnotatedClass(Automobile.class);
        cfg.addAnnotatedClass(Multa.class);

        // Apertura della sessione di Hibernate
        try (Session session = cfg.buildSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

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

            // Salvataggio delle entità nel database
            session.save(persona);
            session.save(auto1);
            session.save(auto2);
            session.save(multa1);
            session.save(multa2);

            // Commit della transazione
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-postgres");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        try {
////            Cliente cliente = new Cliente();
////            cliente.setNome("Mario Rossi");
////            cliente.setEmail("mario.rossi@example.com");
////
////            Ordine ordine = new Ordine();
////            ordine.setDataOrdine(new Date());
////            ordine.setCliente(cliente);
////
////            Prodotto prodotto = new Prodotto();
////            prodotto.setNomeProdotto("Tavolo");
////            prodotto.setPrezzo(new BigDecimal("120.00"));
////            prodotto.setOrdine(ordine);
////
////            em.persist(cliente);
////            em.persist(ordine);
////            em.persist(prodotto);
//
//            em.getTransaction().commit();
//            System.out.println("Dati inseriti correttamente.");
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
}
