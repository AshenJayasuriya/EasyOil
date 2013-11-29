package com.easy.oil.task;

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
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.WebServiceMessageSender;

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
			
					  
			double exchangeValue;
	
		    String xmlRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<hs:CurrencyRequest xmlns:hs=\"http://com/blog/samples/webservices/accountservice\">"
			+ "<hs:Currency>LKR</hs:Currency>" 
			+"<hs:Value>0</hs:Value>" 
			+ "</hs:CurrencyRequest>";

		    String wsdlUrl = "http://localhost:8080/spring-webservices-sample/endpoints/AccountDetailsService.wsdl";
		    StreamSource requestMessage = new StreamSource(new StringReader(xmlRequest));
		    StreamResult responseMessage = new StreamResult(new File("file.xml"));
		    WebServiceTemplate template = new WebServiceTemplate();
		    template.sendSourceAndReceiveToResult(wsdlUrl, requestMessage,responseMessage);

		try {
			 
			File fXmlFile = new File("/home/bimsara/Bimsarav/GitSpring/Currency Converter/file.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

	
			doc.getDocumentElement().normalize();

	

			NodeList nList = doc.getElementsByTagName("ns3:CurrencyRes");



			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(0);
	
		
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					exchangeValue = Double.parseDouble(eElement.getElementsByTagName("ns2:Value").item(0).getTextContent());
					System.out.println(exchangeValue);
		
				}
			}
		   } catch (Exception e) {
			e.printStackTrace();
		   }

				   }
	   }

}
