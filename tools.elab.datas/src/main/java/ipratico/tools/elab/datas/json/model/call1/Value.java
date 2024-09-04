package ipratico.tools.elab.datas.json.model.call1;

import java.util.List;
import java.util.Map;

public class Value {
	private Log log;
    private String appVersion;
    private String type;
    private List<String> channels;
    private String deviceId;
    private String documentType;
    private double creditTotal;
    private String orderId;
    private List<VatResume> vatResume;
    private String billNumber;
    private double surchargesTotal;
    private String hasEdoc;
    private String fixedByApp;
    private String businessMemberId;
    private boolean didScanGiftBill;
    private String deviceName;
    private List<Payment> payments;
    private double discountsTotal;
    private String zNumber;
    private String purpose;
    private String closedOrderId;
    private double paymentsTotal;
    private double receiptAmount;
    private String fixedByAdditionalCheckOnConnectionError;
    private Map<String, Object> invoiceAdditionalInformations;
    private String needsToBeFiscalized;
    private String originalOrderLogCreatedDate;
    private double originalOrderTotal;
    private String printSessionIdentifier;
    private List<PrintedOrderItem> printedOrderItems;
    private String responsibleDeviceId;
    private List<String> scaleWeightedDocumentIds;
    private String successfullyPrintedOnFiscal;
    private double variableCostsTotal;
    private String closureDate;
    private String closureId;
    private String referenceDate;
    private int referenceWeekDay;
    
	public Log getLog() {
		return log;
	}
	public void setLog(Log log) {
		this.log = log;
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
	public List<String> getChannels() {
		return channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
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
	public double getCreditTotal() {
		return creditTotal;
	}
	public void setCreditTotal(double creditTotal) {
		this.creditTotal = creditTotal;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<VatResume> getVatResume() {
		return vatResume;
	}
	public void setVatResume(List<VatResume> vatResume) {
		this.vatResume = vatResume;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public double getSurchargesTotal() {
		return surchargesTotal;
	}
	public void setSurchargesTotal(double surchargesTotal) {
		this.surchargesTotal = surchargesTotal;
	}
	public String getHasEdoc() {
		return hasEdoc;
	}
	public void setHasEdoc(String hasEdoc) {
		this.hasEdoc = hasEdoc;
	}
	public String getFixedByApp() {
		return fixedByApp;
	}
	public void setFixedByApp(String fixedByApp) {
		this.fixedByApp = fixedByApp;
	}
	public String getBusinessMemberId() {
		return businessMemberId;
	}
	public void setBusinessMemberId(String businessMemberId) {
		this.businessMemberId = businessMemberId;
	}
	public boolean isDidScanGiftBill() {
		return didScanGiftBill;
	}
	public void setDidScanGiftBill(boolean didScanGiftBill) {
		this.didScanGiftBill = didScanGiftBill;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public double getDiscountsTotal() {
		return discountsTotal;
	}
	public void setDiscountsTotal(double discountsTotal) {
		this.discountsTotal = discountsTotal;
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
	public double getPaymentsTotal() {
		return paymentsTotal;
	}
	public void setPaymentsTotal(double paymentsTotal) {
		this.paymentsTotal = paymentsTotal;
	}
	public double getReceiptAmount() {
		return receiptAmount;
	}
	public void setReceiptAmount(double receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getFixedByAdditionalCheckOnConnectionError() {
		return fixedByAdditionalCheckOnConnectionError;
	}
	public void setFixedByAdditionalCheckOnConnectionError(String fixedByAdditionalCheckOnConnectionError) {
		this.fixedByAdditionalCheckOnConnectionError = fixedByAdditionalCheckOnConnectionError;
	}
	public Map<String, Object> getInvoiceAdditionalInformations() {
		return invoiceAdditionalInformations;
	}
	public void setInvoiceAdditionalInformations(Map<String, Object> invoiceAdditionalInformations) {
		this.invoiceAdditionalInformations = invoiceAdditionalInformations;
	}
	public String getNeedsToBeFiscalized() {
		return needsToBeFiscalized;
	}
	public void setNeedsToBeFiscalized(String needsToBeFiscalized) {
		this.needsToBeFiscalized = needsToBeFiscalized;
	}
	public String getOriginalOrderLogCreatedDate() {
		return originalOrderLogCreatedDate;
	}
	public void setOriginalOrderLogCreatedDate(String originalOrderLogCreatedDate) {
		this.originalOrderLogCreatedDate = originalOrderLogCreatedDate;
	}
	public double getOriginalOrderTotal() {
		return originalOrderTotal;
	}
	public void setOriginalOrderTotal(double originalOrderTotal) {
		this.originalOrderTotal = originalOrderTotal;
	}
	public String getPrintSessionIdentifier() {
		return printSessionIdentifier;
	}
	public void setPrintSessionIdentifier(String printSessionIdentifier) {
		this.printSessionIdentifier = printSessionIdentifier;
	}
	public List<PrintedOrderItem> getPrintedOrderItems() {
		return printedOrderItems;
	}
	public void setPrintedOrderItems(List<PrintedOrderItem> printedOrderItems) {
		this.printedOrderItems = printedOrderItems;
	}
	public String getResponsibleDeviceId() {
		return responsibleDeviceId;
	}
	public void setResponsibleDeviceId(String responsibleDeviceId) {
		this.responsibleDeviceId = responsibleDeviceId;
	}
	public List<String> getScaleWeightedDocumentIds() {
		return scaleWeightedDocumentIds;
	}
	public void setScaleWeightedDocumentIds(List<String> scaleWeightedDocumentIds) {
		this.scaleWeightedDocumentIds = scaleWeightedDocumentIds;
	}
	public String getSuccessfullyPrintedOnFiscal() {
		return successfullyPrintedOnFiscal;
	}
	public void setSuccessfullyPrintedOnFiscal(String successfullyPrintedOnFiscal) {
		this.successfullyPrintedOnFiscal = successfullyPrintedOnFiscal;
	}
	public double getVariableCostsTotal() {
		return variableCostsTotal;
	}
	public void setVariableCostsTotal(double variableCostsTotal) {
		this.variableCostsTotal = variableCostsTotal;
	}
	public String getClosureDate() {
		return closureDate;
	}
	public void setClosureDate(String closureDate) {
		this.closureDate = closureDate;
	}
	public String getClosureId() {
		return closureId;
	}
	public void setClosureId(String closureId) {
		this.closureId = closureId;
	}
	public String getReferenceDate() {
		return referenceDate;
	}
	public void setReferenceDate(String referenceDate) {
		this.referenceDate = referenceDate;
	}
	public int getReferenceWeekDay() {
		return referenceWeekDay;
	}
	public void setReferenceWeekDay(int referenceWeekDay) {
		this.referenceWeekDay = referenceWeekDay;
	}
	
	@Override
	public String toString() {
		return "Value [log=" + log + ", appVersion=" + appVersion + ", type=" + type + ", channels=" + channels
				+ ", deviceId=" + deviceId + ", documentType=" + documentType + ", creditTotal=" + creditTotal
				+ ", orderId=" + orderId + ", vatResume=" + vatResume + ", billNumber=" + billNumber
				+ ", surchargesTotal=" + surchargesTotal + ", hasEdoc=" + hasEdoc + ", fixedByApp=" + fixedByApp
				+ ", businessMemberId=" + businessMemberId + ", didScanGiftBill=" + didScanGiftBill + ", deviceName="
				+ deviceName + ", payments=" + payments + ", discountsTotal=" + discountsTotal + ", zNumber=" + zNumber
				+ ", purpose=" + purpose + ", closedOrderId=" + closedOrderId + ", paymentsTotal=" + paymentsTotal
				+ ", receiptAmount=" + receiptAmount + ", fixedByAdditionalCheckOnConnectionError="
				+ fixedByAdditionalCheckOnConnectionError + ", invoiceAdditionalInformations="
				+ invoiceAdditionalInformations + ", needsToBeFiscalized=" + needsToBeFiscalized
				+ ", originalOrderLogCreatedDate=" + originalOrderLogCreatedDate + ", originalOrderTotal="
				+ originalOrderTotal + ", printSessionIdentifier=" + printSessionIdentifier + ", printedOrderItems="
				+ printedOrderItems + ", responsibleDeviceId=" + responsibleDeviceId + ", scaleWeightedDocumentIds="
				+ scaleWeightedDocumentIds + ", successfullyPrintedOnFiscal=" + successfullyPrintedOnFiscal
				+ ", variableCostsTotal=" + variableCostsTotal + ", closureDate=" + closureDate + ", closureId="
				+ closureId + ", referenceDate=" + referenceDate + ", referenceWeekDay=" + referenceWeekDay + "]";
	}   
}
