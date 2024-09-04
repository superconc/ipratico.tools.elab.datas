package ipratico.tools.elab.datas.json.utils.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ipratico.tools.elab.datas.json.model.call1.PaymentSession;
import ipratico.tools.elab.datas.json.utils.IinterfaceCalls;

public class FirstCall extends MasterCall_abstract implements IinterfaceCalls{
	private static final Logger logger = LoggerFactory.getLogger(FirstCall.class);
	private String urlCall;
	private String dateFrom;
	private String dateTo;
	private String key;
	private String json = null;
	private List<PaymentSession> paymentSessions = null;
	
	
	public FirstCall(String urlCall, String dateFrom, String dateTo, String key)
	{
		this.urlCall = urlCall;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.key = key;
		
	}
	
	public boolean execute()
	{
		logger.info("Start prima chiamata per ....... ");
		boolean check = true;
		try
		{
			getJson();
			deserializza();
			
			check = checkBeanList();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			check = false;
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
			check = false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			check = false;
		}
		
		logger.info("Fine prima chiamata per ....... con esito: " + check);
		return check;
	}
	
	private String getJson() throws IOException, InterruptedException {
		
		String url = String.format(urlCall, dateFrom, dateTo);

        // Stampa l'URL per debug
        System.out.println("Request URL: " + url);

        json = chiamaIpratico(url, key);
        
        return json;
	}
	
	private List<PaymentSession> deserializza() throws IOException
	{
        // Creazione dell'ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Deserializzazione del JSON in una lista di oggetti PaymentSession
        	paymentSessions = objectMapper.readValue(json, new TypeReference<List<PaymentSession>>(){});

            // Itera su ogni sessione di pagamento per visualizzare i dati
            for (PaymentSession session : paymentSessions) {
                System.out.println("ID: " + session.getId());
                System.out.println("CAS: " + session.getCas());
                System.out.println("App Version: " + session.getValue().getAppVersion());
                // Puoi accedere ad altri campi dell'oggetto session secondo necessità
            }
        } catch (IOException ioe) 
        {
        	logger.error(ioe.toString());
            ioe.printStackTrace();
        }
        return paymentSessions;
	}
	
	private boolean checkBeanList()
	{
		if(paymentSessions == null)
			return false;
		if(paymentSessions.size() == 0)
			return false;
		return true;
	}
	

	public <T> List<T> getList(Class<T> clazz) {
	    // Assumendo che 'paymentSessions' sia una lista di oggetti di tipo 'T'
	    // Puoi usare 'clazz' per creare una nuova lista e riempirla con oggetti di tipo 'T'
	    List<T> result = new ArrayList<>();
	    
	    // Esempio: se paymentSessions è una lista di PaymentSession, devi fare un cast
	    // e filtrare o convertire gli oggetti a tipo T. Questo dipende dalla tua implementazione.
	    for (Object session : paymentSessions) {
	        if (clazz.isInstance(session)) {
	            result.add(clazz.cast(session));
	        }
	    }
	    
	    return result;
	}
}
