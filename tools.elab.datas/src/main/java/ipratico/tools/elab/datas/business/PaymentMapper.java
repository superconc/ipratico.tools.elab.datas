package ipratico.tools.elab.datas.business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentMapper {

	public static void copyJsonToHibernate(ipratico.tools.elab.datas.json.model.call1.Payment jsonPayment,
			ipratico.tools.elab.datas.persitence.beans.callJson.Payment hibernatePayment) throws ParseException {
		// Copia il campo createdDate
		
		String jsonDate = jsonPayment.getCreatedDate();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // Formato ISO 8601
		
		Date parsedDate = dateFormat.parse(jsonDate);
		hibernatePayment.setCreatedDate(parsedDate);

		// Copia il campo amount
		hibernatePayment.setAmount((float) jsonPayment.getAmount());

		// Copia il campo isPaymentWithFidelityCard
		String jsonFidelityCard = jsonPayment.getIsPaymentWithFidelityCard();
		Boolean isPaymentWithFidelityCard = Boolean.valueOf(jsonFidelityCard);
		hibernatePayment.setIsPaymentWithFidelityCard(isPaymentWithFidelityCard);

		// Copia il campo originalPaymentId
		hibernatePayment.setOriginalPaymentId(jsonPayment.getOriginalPaymentId());

		hibernatePayment.setMoneyTypeId(jsonPayment.getTransactionDetail().getMoneyTypeId());

		hibernatePayment.setMoneyTypeName(jsonPayment.getTransactionDetail().getMoneyTypeName());
		
	}
}
