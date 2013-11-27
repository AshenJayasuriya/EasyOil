package com.easy.oil.data;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, Integer>{	
	List findByType(String type);
	//Currency Usd_value();
	@Query("SELECT n from Currency n JOIN n.key k WITH k.clientId = ?1 and k.evalDate = ?2 "
            + "WHERE n.parent is null and n.isSoftDeleted = false ")
    List find(String clientId);
}
