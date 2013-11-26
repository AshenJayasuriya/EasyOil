package com.easy.oil.task;
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
	private int  k = 0;
	@Scheduled(cron="*/10 * * * * ?")//10 seconds
	private  void ServiceMethod()
	{
		Update_rates(k);
		k = k+1;		
	}
	
	private void Update_rates(int k){
		   //currency_rate.
		   int count =  (int) currency_change.count();
		   Currency cc = currency_change.findOne(1);
		   cc.setUsd_value(k);
		   currency_change.save(cc);
		   //currency_change.
	   }

}
