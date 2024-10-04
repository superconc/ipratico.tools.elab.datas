package ipratico.tools.elab.datas.business.mapper;

public class PrintedOrderItemMapper {

    public static void copyJsonToHibernate(ipratico.tools.elab.datas.json.model.call1.PrintedOrderItem jsonPrintedOrderItem, ipratico.tools.elab.datas.persitence.beans.callJson.PrintedOrderItemEntity hibernatePrintedOrderItem) {
        // Copia il campo order
        hibernatePrintedOrderItem.setOrderId(jsonPrintedOrderItem.getOrder());

        // Copia il campo orderItemName
        hibernatePrintedOrderItem.setOrderItemName(jsonPrintedOrderItem.getOrderItemName());

        // Copia il campo productId
        if (jsonPrintedOrderItem.getProduct() != null) {
            hibernatePrintedOrderItem.setProductId(jsonPrintedOrderItem.getProduct().getProductId());
        }

        // Copia il campo quantity (conversione da int a Integer)
        hibernatePrintedOrderItem.setQuantity(jsonPrintedOrderItem.getQuantity());

        // Copia il campo finalNetPrice (conversione da double a Float)
        hibernatePrintedOrderItem.setFinalNetPrice((float) jsonPrintedOrderItem.getFinalNetPrice());

        // Copia il campo finalPrice (conversione da double a Float)
        hibernatePrintedOrderItem.setFinalPrice((float) jsonPrintedOrderItem.getFinalPrice());

        // Copia il campo vatRecordCategoryId
        hibernatePrintedOrderItem.setVatRecordCategoryId(jsonPrintedOrderItem.getVatRecordCategoryId());

        // Copia il campo vatRecordCategoryName se presente
        if (jsonPrintedOrderItem.getVatRecordCategory() != null) {
            hibernatePrintedOrderItem.setVatRecordCategoryName(jsonPrintedOrderItem.getVatRecordCategory().getName());
        }

        // Il campo closedPaymentSession sarà impostato a parte, non presente nel bean JSON
        //TODO SAMUELE
    }
}
