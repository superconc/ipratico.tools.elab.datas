package ipratico.tools.elab.datas.json.model.call1;

public class PaymentSession {
	private String id;
    private String cas;
    private Value value;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCas() {
		return cas;
	}
	public void setCas(String cas) {
		this.cas = cas;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "PaymentSession [id=" + id + ", cas=" + cas + ", value=" + value + "]";
	}
}
