package ipratico.tools.elab.datas.persitence.beans.callJson;

import javax.persistence.*;
import java.util.Date;
/**
 * contiene il bean json Payment + Transactional
 */
@Entity
@Table(name = "payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "is_payment_with_fidelity_card")
    private Boolean isPaymentWithFidelityCard;

    @Column(name = "original_payment_id")
    private String originalPaymentId;

    @Column(name = "money_type_name")
    private String moneyTypeName;

    @Column(name = "money_type_id")
    private String moneyTypeId;

    @ManyToOne
    @JoinColumn(name = "closed_payment_session_id", nullable = false)
    private ClosedPaymentSessionEntity closedPaymentSession;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Boolean getIsPaymentWithFidelityCard() {
		return isPaymentWithFidelityCard;
	}

	public void setIsPaymentWithFidelityCard(Boolean isPaymentWithFidelityCard) {
		this.isPaymentWithFidelityCard = isPaymentWithFidelityCard;
	}

	public String getOriginalPaymentId() {
		return originalPaymentId;
	}

	public void setOriginalPaymentId(String originalPaymentId) {
		this.originalPaymentId = originalPaymentId;
	}

	public String getMoneyTypeName() {
		return moneyTypeName;
	}

	public void setMoneyTypeName(String moneyTypeName) {
		this.moneyTypeName = moneyTypeName;
	}

	public String getMoneyTypeId() {
		return moneyTypeId;
	}

	public void setMoneyTypeId(String moneyTypeId) {
		this.moneyTypeId = moneyTypeId;
	}

	public ClosedPaymentSessionEntity getClosedPaymentSession() {
		return closedPaymentSession;
	}

	public void setClosedPaymentSession(ClosedPaymentSessionEntity closedPaymentSession) {
		this.closedPaymentSession = closedPaymentSession;
	}

}
