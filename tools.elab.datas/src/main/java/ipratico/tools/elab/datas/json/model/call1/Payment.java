package ipratico.tools.elab.datas.json.model.call1;

public class Payment {
	private String createdDate;
    private double amount;
    private String isPaymentWithFidelityCard;
    private String originalPaymentId;
    private TransactionDetail transactionDetail;
    
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getIsPaymentWithFidelityCard() {
		return isPaymentWithFidelityCard;
	}
	public void setIsPaymentWithFidelityCard(String isPaymentWithFidelityCard) {
		this.isPaymentWithFidelityCard = isPaymentWithFidelityCard;
	}
	public String getOriginalPaymentId() {
		return originalPaymentId;
	}
	public void setOriginalPaymentId(String originalPaymentId) {
		this.originalPaymentId = originalPaymentId;
	}
	public TransactionDetail getTransactionDetail() {
		return transactionDetail;
	}
	public void setTransactionDetail(TransactionDetail transactionDetail) {
		this.transactionDetail = transactionDetail;
	}
	@Override
	public String toString() {
		return "Payment [createdDate=" + createdDate + ", amount=" + amount + ", isPaymentWithFidelityCard="
				+ isPaymentWithFidelityCard + ", originalPaymentId=" + originalPaymentId + ", transactionDetail="
				+ transactionDetail + "]";
	}
	
}
