package ipratico.tools.elab.datas.persitence.beans.callJson;

import javax.persistence.*;

@Entity
@Table(name = "printed_order_items")
public class PrintedOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_name")
    private String orderItemName;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "final_net_price")
    private Float finalNetPrice;

    @Column(name = "final_price")
    private Float finalPrice;

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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderItemName() {
		return orderItemName;
	}

	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getFinalNetPrice() {
		return finalNetPrice;
	}

	public void setFinalNetPrice(Float finalNetPrice) {
		this.finalNetPrice = finalNetPrice;
	}

	public Float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Float finalPrice) {
		this.finalPrice = finalPrice;
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
