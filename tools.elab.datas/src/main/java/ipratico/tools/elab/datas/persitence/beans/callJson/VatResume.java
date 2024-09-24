package ipratico.tools.elab.datas.persitence.beans.callJson;

import javax.persistence.*;

@Entity
@Table(name = "vat_resume")
public class VatResume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ManyToOne
    @JoinColumn(name = "closed_payment_session_id", nullable = false)
    private ClosedPaymentSession closedPaymentSession;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public ClosedPaymentSession getClosedPaymentSession() {
		return closedPaymentSession;
	}

	public void setClosedPaymentSession(ClosedPaymentSession closedPaymentSession) {
		this.closedPaymentSession = closedPaymentSession;
	}
}
