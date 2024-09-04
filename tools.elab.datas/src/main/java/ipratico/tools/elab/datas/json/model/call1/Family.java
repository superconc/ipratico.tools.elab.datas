package ipratico.tools.elab.datas.json.model.call1;

public class Family {
	private String name;
    private String familyId;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyId() {
		return familyId;
	}
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}
	@Override
	public String toString() {
		return "Family [name=" + name + ", familyId=" + familyId + "]";
	}

}
