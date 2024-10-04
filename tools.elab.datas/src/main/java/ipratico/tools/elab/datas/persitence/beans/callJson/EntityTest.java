package ipratico.tools.elab.datas.persitence.beans.callJson;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Table(name = "closed_payment_session")
public class EntityTest {
    @Id
    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    // Getters and setters
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
