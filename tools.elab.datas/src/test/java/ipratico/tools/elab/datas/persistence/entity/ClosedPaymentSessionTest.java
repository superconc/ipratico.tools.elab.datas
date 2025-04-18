package ipratico.tools.elab.datas.persistence.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "closed_payment_session_test")
public class ClosedPaymentSessionTest {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "closed_payment_session_test_seq")
    @SequenceGenerator(name = "closed_payment_session_test_seq", sequenceName = "closed_payment_session_id_seq_test", allocationSize = 1)
    private Integer id;

    private String cas;
    private String appVersion;
    private String type;
    private String deviceId;
    private String documentType;
    private Float creditTotal = 0.0f;
    private String orderId;
    private String billNumber;
    private Float surchargesTotal = 0.0f;
    private Boolean hasEdoc;
    private Boolean fixedByApp;
    private String businessMemberId;
    private Boolean didScanGiftBill;
    private String deviceName;
    private String zNumber;
    private String purpose;
    private String closedOrderId;
    private Float paymentsTotal;
    private Float receiptAmount;
    private Date closureDate;
    private String closureId;
    private Date referenceDate;
    private Integer referenceWeekDay;
    private Boolean successfullyPrintedOnFiscal;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

}