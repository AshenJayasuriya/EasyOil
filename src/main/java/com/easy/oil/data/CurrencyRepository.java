package com.easy.oil.data;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface CurrencyRepository extends CrudRepository<Currency, Integer>{	
	Currency findByType(String type);//find by type
		
	@Modifying //updating
	@Query("UPDATE Currency c SET c.usd_value = ?1 " +
			"WHERE c.id = ?2 ")
	Integer Update(double value, int id);
}
