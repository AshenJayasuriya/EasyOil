package com.easy.oil.task;
import javassist.bytecode.ConstantAttribute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

import com.easy.oil.data.BeanConfiguration;
import com.easy.oil.data.Currency;
import com.easy.oil.data.CurrencyRepository;
// for currency converter
import java.io.StringReader;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.ws.client.core.WebServiceTemplate;

public class Corns {
	//dependency injection
	private AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	private CurrencyRepository currency_change = context.getBean(CurrencyRepository.class);
	//test
	private double  k = 0;
	@Scheduled(cron="*/10 * * * * ?")//set time delay in seconds
	private  void ServiceMethod()
	{
		Update_rates(k);
		k = k+1;		
	}
	
	private void Update_rates(double k){
		   //currency_rate.
		  int count =  (int) currency_change.count();
		  for (int i = 1 ; i <= count ; i++){			   
			   Currency change = currency_change.findOne(i);
			   String type = change.getType();
			  /*
			   * web service goes here 
			   * send currency type from currency object
			   * get value of 1 USD according to type 
			   *commit the new value to db
			   * 
			   */
			  // int return_values = currency_change.Update(k,i);
			
			String xmlRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<hs:CurrencyRequest xmlns:hs=\http://com/blog/samples/webservices/accountservice\">"
			+ "<hs:Currency>LKR</hs:Currency>" 
			+"<hs:Value>0</hs:Value>" 
			+ "</hs:CurrencyRequest>";
			/* * for normal user <hs:Value>0</hs:Value> (default  position)
			  * to change the value of each currency, change the "Value" as admin
			*/
		    String wsdlUrl = "http://localhost:8080/spring-webservices-sample/endpoints/AccountDetailsService.wsdl";
		    StreamSource requestMessage = new StreamSource(new StringReader(xmlRequest));
		    StreamResult responseMessage = new StreamResult(System.out);
		    WebServiceTemplate template = new WebServiceTemplate();
		    template.sendSourceAndReceiveToResult(wsdlUrl, requestMessage,
			responseMessage);

		   }
	   }

}
