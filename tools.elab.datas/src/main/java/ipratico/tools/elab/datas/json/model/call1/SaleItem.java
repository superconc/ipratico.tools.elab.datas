package ipratico.tools.elab.datas.json.model.call1;

public class SaleItem {
	private String productId;
    private String vatRecordCategoryId;
    
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getVatRecordCategoryId() {
		return vatRecordCategoryId;
	}
	public void setVatRecordCategoryId(String vatRecordCategoryId) {
		this.vatRecordCategoryId = vatRecordCategoryId;
	}
	@Override
	public String toString() {
		return "SaleItem [productId=" + productId + ", vatRecordCategoryId=" + vatRecordCategoryId + "]";
	}

}
