package ipratico.tools.elab.datas.json.model.call1;

public class VatResume {
	private int rate;
    private String shortName;
    private double tax;
    private double netValue;
    private double taxedValue;
    private String vatRecordCategoryId;
    private String vatRecordCategoryName;
    
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
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getNetValue() {
		return netValue;
	}
	public void setNetValue(double netValue) {
		this.netValue = netValue;
	}
	public double getTaxedValue() {
		return taxedValue;
	}
	public void setTaxedValue(double taxedValue) {
		this.taxedValue = taxedValue;
	}
	public String getVatRecordCategoryId() {
		return vatRecordCategoryId;
	}
	public void setVatRecordCategoryId(String vatRecordCategoryId) {
		this.vatRecordCategoryId = vatRecordCategoryId;
	}
	public String getVatRecordCategoryName() {
		return vatRecordCategoryName;
	}
	public void setVatRecordCategoryName(String vatRecordCategoryName) {
		this.vatRecordCategoryName = vatRecordCategoryName;
	}
	
	@Override
	public String toString() {
		return "VatResume [rate=" + rate + ", shortName=" + shortName + ", tax=" + tax + ", netValue=" + netValue
				+ ", taxedValue=" + taxedValue + ", vatRecordCategoryId=" + vatRecordCategoryId
				+ ", vatRecordCategoryName=" + vatRecordCategoryName + "]";
	}
	
	
}
