package com.easy.oil.task;
import javassist.bytecode.ConstantAttribute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

import com.easy.oil.data.BeanConfiguration;
import com.easy.oil.data.Currency;
import com.easy.oil.data.CurrencyRepository;

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
		   }
	   }

}
