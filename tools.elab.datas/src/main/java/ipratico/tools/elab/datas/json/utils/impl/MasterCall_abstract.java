package ipratico.tools.elab.datas.json.utils.impl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class MasterCall_abstract {
	private static final Logger logger = LoggerFactory.getLogger(MasterCall_abstract.class);
	
	public String chiamaIpratico(String url, String key) throws IOException, InterruptedException
	{
		
		
		String json = null;
		HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .header("x-api-key", key)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
		
		logger.info("request.toString: " + request.toString());
		
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        // Stampa lo stato della risposta e gli header
        logger.debug("Response Status Code: " + response.statusCode() + "\n\n-------------------");
        logger.debug("Response Headers: " + response.headers() + "\n\n-------------------");

        // Stampa la risposta grezza
        logger.debug("Raw response: " + response.body() + "\n\n-------------------");
        
        // Prova a determinare se la risposta è un oggetto JSON o un array JSON
        String responseBody = response.body().trim();
        if (responseBody.startsWith("{"))
        {
        	logger.debug("E' un JSONObject");
            // È un oggetto JSON
            JSONObject jsonObject = new JSONObject(responseBody);
            json = jsonObject.toString(4);
            //System.out.println(jsonObject.toString(4)); // Indentazione di 4 spazi
        }
        else if (responseBody.startsWith("["))
        {
        	logger.debug("E' un JSONARRAY");
            // È un array JSON
            JSONArray jsonArray = new JSONArray(responseBody);

            if (jsonArray.isEmpty())
            {
            	logger.debug("ERRORE: Nessun dato ritornato dall'interrogazione");
            }
            else
            {
            	json = jsonArray.toString(4);
                //System.out.println(jsonArray.toString(4)); // Indentazione di 4 spazi
            }
        }
        else
        {
        	logger.debug("La risposta non è né un oggetto JSON né un array JSON.");
        }

        logger.debug("####################### JSON #########################\r\n" + json);
        
        return json;

	}
	
	public abstract boolean execute();
	
	public abstract <T> List<T> getList(Class<T> clazz);

}
