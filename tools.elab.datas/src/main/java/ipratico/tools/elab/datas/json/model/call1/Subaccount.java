package ipratico.tools.elab.datas.json.model.call1;

public class Subaccount {
	private String name;
    private int index;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return "Subaccount [name=" + name + ", index=" + index + "]";
	}
	
}
