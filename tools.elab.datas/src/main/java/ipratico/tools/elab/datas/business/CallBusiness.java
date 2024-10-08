package ipratico.tools.elab.datas.business;

import java.util.Iterator;
import java.util.List;

import ipratico.tools.elab.datas.business.mapper.ValueToClosedPaymentSessionMapper;
import ipratico.tools.elab.datas.enums.NumeroCallEnum;
import ipratico.tools.elab.datas.json.model.call1.PaymentSession;
import ipratico.tools.elab.datas.json.utils.impl.FirstCall;
import ipratico.tools.elab.datas.json.utils.impl.MasterCall_abstract;
import ipratico.tools.elab.datas.persitence.beans.NegozioConfigEntity;
import ipratico.tools.elab.datas.persitence.beans.callJson.ClosedPaymentSessionEntity;
import ipratico.tools.elab.datas.persitence.dao.ClosedPaymentSessionDao;

public class CallBusiness {
	
	/**
	 * Da usare per più negozi
	 * @param negozioConfigEntities
	 * @param dateFrom
	 * @param dateTo
	 */
	public void executeCall(List<NegozioConfigEntity> negozioConfigEntities, String dateFrom, String dateTo) {

		for (Iterator<NegozioConfigEntity> iterator = negozioConfigEntities.iterator(); iterator.hasNext();) {
			NegozioConfigEntity negozioConfigEntity = (NegozioConfigEntity) iterator.next();
			// "https://apicbdev.ipraticocloud.com/api/public/closed-payment-sessions?dateFrom=%s&dateTo=%s";
			String url = negozioConfigEntity.getApiCall();
			// String key = "12747:64f49f08-00e6-4ed3-a5cf-b53040a55ce5";
			String key = negozioConfigEntity.getApiKey();

			if (negozioConfigEntity.getIdChiamata().equals(NumeroCallEnum.CALL_UNO.getNumero())) 
			{
				MasterCall_abstract resultCall = new FirstCall(url, dateFrom, dateTo, key);
	            if(resultCall.execute())
	            	resultCall.getList(PaymentSession.class);
	            
			} else if (negozioConfigEntity.getIdChiamata().equals(NumeroCallEnum.CALL_DUE.getNumero())) 
			{
				//TODO
				//CHIAMATA DUE --> per il momento non c'e'

			} else if (negozioConfigEntity.getIdChiamata().equals(NumeroCallEnum.CALL_TRE.getNumero())) 
			{
				//TODO
				//CHIAMATA TRE --> per il momento non c'e'
			}
		}
	}
	
	
	public void prepareDatasCall1(List<PaymentSession> paymentSessions) throws Exception 
	{
		for (Iterator<PaymentSession> iterator = paymentSessions.iterator(); iterator.hasNext();) {
			PaymentSession paymentSession = (PaymentSession) iterator.next();
			paymentSession.getValue();
			
			//bean della sezione persistence
			ClosedPaymentSessionEntity hibernateClosePaymentSession = new ClosedPaymentSessionEntity();
			ValueToClosedPaymentSessionMapper.copyJsonToHibernate(paymentSession.getValue(),hibernateClosePaymentSession);
			ClosedPaymentSessionDao.insert(hibernateClosePaymentSession);
		}
	}
}
