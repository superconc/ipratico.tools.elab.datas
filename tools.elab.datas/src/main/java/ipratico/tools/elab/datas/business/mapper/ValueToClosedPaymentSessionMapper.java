package ipratico.tools.elab.datas.business.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ipratico.tools.elab.datas.config.ConfigLoader;

public class ValueToClosedPaymentSessionMapper {

    public static void copyJsonToHibernate(ipratico.tools.elab.datas.json.model.call1.Value jsonValue, ipratico.tools.elab.datas.persitence.beans.callJson.ClosedPaymentSessionEntity hibernateClosePaymentSession) throws ParseException {
        // Copia i campi semplici
        hibernateClosePaymentSession.setAppVersion(jsonValue.getAppVersion());
        hibernateClosePaymentSession.setType(jsonValue.getType());
        hibernateClosePaymentSession.setDeviceId(jsonValue.getDeviceId());
        hibernateClosePaymentSession.setDocumentType(jsonValue.getDocumentType());
        hibernateClosePaymentSession.setCreditTotal((float) jsonValue.getCreditTotal());
        hibernateClosePaymentSession.setOrderId(jsonValue.getOrderId());
        hibernateClosePaymentSession.setBillNumber(jsonValue.getBillNumber());
        hibernateClosePaymentSession.setSurchargesTotal((float) jsonValue.getSurchargesTotal());
        hibernateClosePaymentSession.setHasEdoc(Boolean.valueOf(jsonValue.getHasEdoc()));
        hibernateClosePaymentSession.setFixedByApp(Boolean.valueOf(jsonValue.getFixedByApp()));
        hibernateClosePaymentSession.setBusinessMemberId(jsonValue.getBusinessMemberId());
        hibernateClosePaymentSession.setDidScanGiftBill(jsonValue.isDidScanGiftBill());
        hibernateClosePaymentSession.setDeviceName(jsonValue.getDeviceName());
        hibernateClosePaymentSession.setzNumber(jsonValue.getzNumber());
        hibernateClosePaymentSession.setPurpose(jsonValue.getPurpose());
        hibernateClosePaymentSession.setClosedOrderId(jsonValue.getClosedOrderId());
        hibernateClosePaymentSession.setPaymentsTotal((float) jsonValue.getPaymentsTotal());
        hibernateClosePaymentSession.setReceiptAmount((float) jsonValue.getReceiptAmount());
        hibernateClosePaymentSession.setSuccessfullyPrintedOnFiscal(Boolean.valueOf(jsonValue.getSuccessfullyPrintedOnFiscal()));

        // Conversione delle date da String a Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // Formato ISO 8601
        if (jsonValue.getClosureDate() != null) {
            Date closureDate = dateFormat.parse(jsonValue.getClosureDate());
            hibernateClosePaymentSession.setClosureDate(closureDate);
        }
        if (jsonValue.getReferenceDate() != null) {
        	SimpleDateFormat dateFormatReferenceDate = new SimpleDateFormat(ConfigLoader.getProperty("ipratico.format.date.reference"));
            Date referenceDate = dateFormatReferenceDate.parse(jsonValue.getReferenceDate());
            hibernateClosePaymentSession.setReferenceDate(referenceDate);
        }

        hibernateClosePaymentSession.setClosureId(jsonValue.getClosureId());
        hibernateClosePaymentSession.setReferenceWeekDay(jsonValue.getReferenceWeekDay());

        // Conversione di liste di oggetti (es. payments)
        if (jsonValue.getPayments() != null) {
            Set<ipratico.tools.elab.datas.persitence.beans.callJson.PaymentEntity> hibernatePayments = new HashSet<>();
            for (ipratico.tools.elab.datas.json.model.call1.Payment jsonPayment : jsonValue.getPayments()) {
                ipratico.tools.elab.datas.persitence.beans.callJson.PaymentEntity hibernatePayment = new ipratico.tools.elab.datas.persitence.beans.callJson.PaymentEntity();
                PaymentMapper.copyJsonToHibernate(jsonPayment, hibernatePayment); // Usa un mapper per i Payment
                hibernatePayments.add(hibernatePayment);
            }
            hibernateClosePaymentSession.setPayments(hibernatePayments);
        }

        // Conversione di vatResume (presupponendo una logica simile per i VatResume)
        if (jsonValue.getVatResume() != null) {
            Set<ipratico.tools.elab.datas.persitence.beans.callJson.VatResumeEntity> hibernateVatResumes = new HashSet<>();
            for (ipratico.tools.elab.datas.json.model.call1.VatResume jsonVatResume : jsonValue.getVatResume()) {
                ipratico.tools.elab.datas.persitence.beans.callJson.VatResumeEntity hibernateVatResume = new ipratico.tools.elab.datas.persitence.beans.callJson.VatResumeEntity();
                VatResumeMapper.copyJsonToHibernate(jsonVatResume, hibernateVatResume); // Usa un mapper per i VatResume
                hibernateVatResumes.add(hibernateVatResume);
            }
            hibernateClosePaymentSession.setVatResumes(hibernateVatResumes);
        }

        // Conversione di printedOrderItems (simile)
        if (jsonValue.getPrintedOrderItems() != null) {
            Set<ipratico.tools.elab.datas.persitence.beans.callJson.PrintedOrderItemEntity> hibernatePrintedOrderItems = new HashSet<>();
            for (ipratico.tools.elab.datas.json.model.call1.PrintedOrderItem jsonPrintedOrderItem : jsonValue.getPrintedOrderItems()) {
                ipratico.tools.elab.datas.persitence.beans.callJson.PrintedOrderItemEntity hibernatePrintedOrderItem = new ipratico.tools.elab.datas.persitence.beans.callJson.PrintedOrderItemEntity();
                PrintedOrderItemMapper.copyJsonToHibernate(jsonPrintedOrderItem, hibernatePrintedOrderItem); // Usa un mapper per i PrintedOrderItems
                hibernatePrintedOrderItems.add(hibernatePrintedOrderItem);
            }
            hibernateClosePaymentSession.setPrintedOrderItems(hibernatePrintedOrderItems);
        }
    }
}
