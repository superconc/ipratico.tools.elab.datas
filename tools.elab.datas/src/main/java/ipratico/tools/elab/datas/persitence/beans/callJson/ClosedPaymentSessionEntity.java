package ipratico.tools.elab.datas.persitence.beans.callJson;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "closed_payment_session")
public class ClosedPaymentSessionEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "cas")
    private String cas;

    @Column(name = "app_version")
    private String appVersion;

    @Column(name = "type")
    private String type;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "credit_total")
    private Float creditTotal;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "bill_number")
    private String billNumber;

    @Column(name = "surcharges_total")
    private Float surchargesTotal;

    @Column(name = "has_edoc")
    private Boolean hasEdoc;

    @Column(name = "fixed_by_app")
    private Boolean fixedByApp;

    @Column(name = "business_member_id")
    private String businessMemberId;

    @Column(name = "did_scan_gift_bill")
    private Boolean didScanGiftBill;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "z_number")
    private String zNumber;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "closed_order_id")
    private String closedOrderId;

    @Column(name = "payments_total")
    private Float paymentsTotal;

    @Column(name = "receipt_amount")
    private Float receiptAmount;

    @Column(name = "closure_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closureDate;

    @Column(name = "closure_id")
    private String closureId;

    @Column(name = "reference_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date referenceDate;

    @Column(name = "reference_week_day")
    private Integer referenceWeekDay;

    @Column(name = "successfully_printed_on_fiscal")
    private Boolean successfullyPrintedOnFiscal;

    @OneToMany(mappedBy = "closedPaymentSession", cascade = CascadeType.ALL)
    private Set<VatResumeEntity> vatResumes;

    @OneToMany(mappedBy = "closedPaymentSession", cascade = CascadeType.ALL)
    private Set<PaymentEntity> payments;

    @OneToMany(mappedBy = "closedPaymentSession", cascade = CascadeType.ALL)
    private Set<PrintedOrderItemEntity> printedOrderItems;

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

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Float getCreditTotal() {
		return creditTotal;
	}

	public void setCreditTotal(Float creditTotal) {
		this.creditTotal = creditTotal;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public Float getSurchargesTotal() {
		return surchargesTotal;
	}

	public void setSurchargesTotal(Float surchargesTotal) {
		this.surchargesTotal = surchargesTotal;
	}

	public Boolean getHasEdoc() {
		return hasEdoc;
	}

	public void setHasEdoc(Boolean hasEdoc) {
		this.hasEdoc = hasEdoc;
	}

	public Boolean getFixedByApp() {
		return fixedByApp;
	}

	public void setFixedByApp(Boolean fixedByApp) {
		this.fixedByApp = fixedByApp;
	}

	public String getBusinessMemberId() {
		return businessMemberId;
	}

	public void setBusinessMemberId(String businessMemberId) {
		this.businessMemberId = businessMemberId;
	}

	public Boolean getDidScanGiftBill() {
		return didScanGiftBill;
	}

	public void setDidScanGiftBill(Boolean didScanGiftBill) {
		this.didScanGiftBill = didScanGiftBill;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getzNumber() {
		return zNumber;
	}

	public void setzNumber(String zNumber) {
		this.zNumber = zNumber;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getClosedOrderId() {
		return closedOrderId;
	}

	public void setClosedOrderId(String closedOrderId) {
		this.closedOrderId = closedOrderId;
	}

	public Float getPaymentsTotal() {
		return paymentsTotal;
	}

	public void setPaymentsTotal(Float paymentsTotal) {
		this.paymentsTotal = paymentsTotal;
	}

	public Float getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(Float receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public Date getClosureDate() {
		return closureDate;
	}

	public void setClosureDate(Date closureDate) {
		this.closureDate = closureDate;
	}

	public String getClosureId() {
		return closureId;
	}

	public void setClosureId(String closureId) {
		this.closureId = closureId;
	}

	public Date getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(Date referenceDate) {
		this.referenceDate = referenceDate;
	}

	public Integer getReferenceWeekDay() {
		return referenceWeekDay;
	}

	public void setReferenceWeekDay(Integer referenceWeekDay) {
		this.referenceWeekDay = referenceWeekDay;
	}

	public Boolean getSuccessfullyPrintedOnFiscal() {
		return successfullyPrintedOnFiscal;
	}

	public void setSuccessfullyPrintedOnFiscal(Boolean successfullyPrintedOnFiscal) {
		this.successfullyPrintedOnFiscal = successfullyPrintedOnFiscal;
	}

	public Set<VatResumeEntity> getVatResumes() {
		return vatResumes;
	}

	public void setVatResumes(Set<VatResumeEntity> vatResumes) {
		this.vatResumes = vatResumes;
	}

	public Set<PaymentEntity> getPayments() {
		return payments;
	}

	public void setPayments(Set<PaymentEntity> payments) {
		this.payments = payments;
	}

	public Set<PrintedOrderItemEntity> getPrintedOrderItems() {
		return printedOrderItems;
	}

	public void setPrintedOrderItems(Set<PrintedOrderItemEntity> printedOrderItems) {
		this.printedOrderItems = printedOrderItems;
	}
}
