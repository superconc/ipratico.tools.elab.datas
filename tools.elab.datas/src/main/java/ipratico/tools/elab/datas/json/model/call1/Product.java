package ipratico.tools.elab.datas.json.model.call1;

import java.util.List;

public class Product {
	private String name;
    private List<String> tags;
    private String productId;
    private Category category;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", tags=" + tags + ", productId=" + productId + ", category=" + category + "]";
	}
}
