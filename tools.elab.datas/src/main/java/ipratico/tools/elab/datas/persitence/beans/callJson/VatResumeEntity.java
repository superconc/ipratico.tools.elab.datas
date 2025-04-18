package ipratico.tools.elab.datas.persitence.beans.callJson;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vat_resume")
@IdClass(VatResumeId.class)
public class VatResumeEntity implements Serializable {

	private static final long serialVersionUID = -8036901813305585181L;

	@Id
    @ManyToOne
    @JoinColumn(name = "closed_payment_session_id", referencedColumnName = "id")
    private ClosedPaymentSessionEntity closedPaymentSessionEntity;

//    @Id
//    private String vatRecordCategoryId;

    @Column(name = "rate")
    private Float rate;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "tax")
    private Float tax;

    @Column(name = "net_value")
    private Float netValue;

    @Column(name = "taxed_value")
    private Float taxedValue;

    @Column(name = "vat_record_category_id")
    private String vatRecordCategoryId;

    @Column(name = "vat_record_category_name")
    private String vatRecordCategoryName;

//    @ManyToOne
//    @JoinColumn(name = "closed_payment_session_id", nullable = false)
//    private ClosedPaymentSessionEntity closedPaymentSessionEntity;

	

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public Float getNetValue() {
		return netValue;
	}

	public void setNetValue(Float netValue) {
		this.netValue = netValue;
	}

	public Float getTaxedValue() {
		return taxedValue;
	}

	public void setTaxedValue(Float taxedValue) {
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

	public ClosedPaymentSessionEntity getClosedPaymentSessionEntoty() {
		return closedPaymentSessionEntity;
	}

	public void setClosedPaymentSession(ClosedPaymentSessionEntity closedPaymentSessionEntity) {
		this.closedPaymentSessionEntity = closedPaymentSessionEntity;
	}

	@Override
	public String toString() {
		return "VatResumeEntity [closedPaymentSessionEntity=" + closedPaymentSessionEntity + ", rate=" + rate
				+ ", shortName=" + shortName + ", tax=" + tax + ", netValue=" + netValue + ", taxedValue=" + taxedValue
				+ ", vatRecordCategoryId=" + vatRecordCategoryId + ", vatRecordCategoryName=" + vatRecordCategoryName
				+ "]";
	}
	
	
}

//Chiave primaria composta
class VatResumeId implements Serializable {
	private Integer closedPaymentSession;
	private String vatRecordCategoryId;
	
	
	public Integer getClosedPaymentSession() {
		return closedPaymentSession;
	}
	public void setClosedPaymentSession(Integer closedPaymentSession) {
		this.closedPaymentSession = closedPaymentSession;
	}
	public String getVatRecordCategoryId() {
		return vatRecordCategoryId;
	}
	public void setVatRecordCategoryId(String vatRecordCategoryId) {
		this.vatRecordCategoryId = vatRecordCategoryId;
	}
	
}
