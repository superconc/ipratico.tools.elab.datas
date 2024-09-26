package ipratico.tools.elab.datas.business.mapper;

public class VatResumeMapper {

    public static void copyJsonToHibernate(ipratico.tools.elab.datas.json.model.call1.VatResume jsonVatResume, ipratico.tools.elab.datas.persitence.beans.callJson.VatResume hibernateVatResume) {
        // Copia il campo rate (conversione da int a Float)
        hibernateVatResume.setRate((float) jsonVatResume.getRate());

        // Copia il campo shortName
        hibernateVatResume.setShortName(jsonVatResume.getShortName());

        // Copia il campo tax (conversione da double a Float)
        hibernateVatResume.setTax((float) jsonVatResume.getTax());

        // Copia il campo netValue (conversione da double a Float)
        hibernateVatResume.setNetValue((float) jsonVatResume.getNetValue());

        // Copia il campo taxedValue (conversione da double a Float)
        hibernateVatResume.setTaxedValue((float) jsonVatResume.getTaxedValue());

        // Copia il campo vatRecordCategoryId
        hibernateVatResume.setVatRecordCategoryId(jsonVatResume.getVatRecordCategoryId());

        // Copia il campo vatRecordCategoryName
        hibernateVatResume.setVatRecordCategoryName(jsonVatResume.getVatRecordCategoryName());
        
        // Il campo closedPaymentSession può essere gestito a parte
        // se necessario, poiché non viene gestito dal bean JSON.
        //TODO Samuele
    }
}