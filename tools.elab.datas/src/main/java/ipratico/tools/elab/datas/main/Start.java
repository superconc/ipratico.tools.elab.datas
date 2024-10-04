package ipratico.tools.elab.datas.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ipratico.tools.elab.datas.business.CallBusiness;
import ipratico.tools.elab.datas.config.ConfigLoader;
import ipratico.tools.elab.datas.json.model.call1.PaymentSession;
import ipratico.tools.elab.datas.json.utils.impl.FirstCall;
import ipratico.tools.elab.datas.json.utils.impl.MasterCall_abstract;
import ipratico.tools.elab.datas.persitence.EntityManagerFactoryProvider;
import ipratico.tools.elab.datas.persitence.beans.NegozioConfigEntity;
import ipratico.tools.elab.datas.service.NegozioConfigService;

public class Start {
	
	private static final Logger logger = LoggerFactory.getLogger(Start.class);
	
	public static void main(String[] args)
    {
		logger.info("START PROCESS");
        try
        {
            // Definisci le date necessarie per i parametri
            String dateFrom = LocalDate.now().minusDays(6).format(DateTimeFormatter.ISO_LOCAL_DATE);
            String dateTo = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
            
            dateFrom = "2024-07-28";
            dateTo = "2024-08-03";

            // Costruisci l'URL con i parametri di query
            //String url = "https://apicbdev.ipraticocloud.com/api/public/closed-payment-sessions?dateFrom=%s&dateTo=%s";
            String url = ConfigLoader.getProperty("ipratico.link.prima.call");
            //String key = "12747:64f49f08-00e6-4ed3-a5cf-b53040a55ce5";
            String key = ConfigLoader.getProperty("ipratico.key");
            
            CallBusiness callBusiness = new CallBusiness();
            
            MasterCall_abstract resultCall = new FirstCall(url, dateFrom, dateTo, key);
            //facendo la chiamata viene anche validata, quindi se entra nell'IF vuol dire che tutto e' andato bene
            if(resultCall.execute()) {
            	List<PaymentSession> paymentSessions = resultCall.getList(PaymentSession.class);
            	
            	
            	callBusiness.prepareDatasCall1(paymentSessions);
            	
            }
            else
            {
            	//TODO eccezione mandare mail ad Ale che qualcosa e' andato storto 
            }
            	
            
        }
        catch (Exception e)
        {
        	logger.error(e.getMessage());
            e.printStackTrace();
        }
        finally {
        	//TODO samuele scommentare per attivare il DB
        	EntityManagerFactoryProvider.close();
		}
        logger.info("END PROCESS");
    }
	
	@SuppressWarnings("unused")
	private void executor(String dateFrom, String dateTo)
	{
		CallBusiness callBusiness = new CallBusiness();
		NegozioConfigService negozioConfigController = new NegozioConfigService();
		List<NegozioConfigEntity> negozioConfigEntities;
		
		negozioConfigEntities = negozioConfigController.getAllActive();
		
		for (Iterator<NegozioConfigEntity> iterator = negozioConfigEntities.iterator(); iterator.hasNext();) {
			NegozioConfigEntity negozioConfigEntity = (NegozioConfigEntity) iterator.next();
			
            callBusiness.executeCall(negozioConfigEntities, dateFrom, dateTo);
            
		}
	}
}
