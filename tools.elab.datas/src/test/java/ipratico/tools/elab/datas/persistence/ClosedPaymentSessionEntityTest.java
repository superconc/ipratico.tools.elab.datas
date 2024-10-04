package ipratico.tools.elab.datas.persistence;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ipratico.tools.elab.datas.persitence.beans.callJson.EntityTest;

public class ClosedPaymentSessionEntityTest {

    @Test
    public void testInsertAndFind() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitSQL");
        EntityManager em = emf.createEntityManager();

        EntityTest closedPaymentSessionEntity = new EntityTest();
        closedPaymentSessionEntity.setSessionId("12345");
        closedPaymentSessionEntity.setTotalAmount(new BigDecimal("100.00"));

        em.getTransaction().begin();
        em.persist(closedPaymentSessionEntity);
        em.getTransaction().commit();

        EntityTest foundSession = em.find(EntityTest.class, "12345");
        assert foundSession != null;
        assert foundSession.getTotalAmount().compareTo(new BigDecimal("100.00")) == 0;

        em.close();
        emf.close();
    }
}
