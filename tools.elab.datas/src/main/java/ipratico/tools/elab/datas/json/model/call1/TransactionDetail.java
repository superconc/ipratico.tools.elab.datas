package ipratico.tools.elab.datas.json.model.call1;

public class TransactionDetail {
	private String moneyTypeName;
    private String moneyTypeId;
    
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
	@Override
	public String toString() {
		return "TransactionDetail [moneyTypeName=" + moneyTypeName + ", moneyTypeId=" + moneyTypeId + "]";
	}
	
}
