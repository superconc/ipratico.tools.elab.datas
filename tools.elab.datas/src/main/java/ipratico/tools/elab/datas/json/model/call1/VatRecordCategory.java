package ipratico.tools.elab.datas.json.model.call1;

public class VatRecordCategory {
	private String name;
    private int rate;
    private String shortName;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	@Override
	public String toString() {
		return "VatRecordCategory [name=" + name + ", rate=" + rate + ", shortName=" + shortName + "]";
	}
}
