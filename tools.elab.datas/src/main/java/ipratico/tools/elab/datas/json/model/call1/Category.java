package ipratico.tools.elab.datas.json.model.call1;

public class Category {
	private String name;
    private String categoryId;
    private Family family;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Family getFamily() {
		return family;
	}
	public void setFamily(Family family) {
		this.family = family;
	}
	@Override
	public String toString() {
		return "Category [name=" + name + ", categoryId=" + categoryId + ", family=" + family + "]";
	}
    
}
