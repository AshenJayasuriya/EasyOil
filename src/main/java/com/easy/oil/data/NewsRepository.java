package com.easy.oil.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<News, Long >{
	
	
	//Getting the latest news
	//@Query ("SELECT n FROM news WHERE n.timestmp=(SELECT MAX(timestamp) FROM news) LIMIT = 1")
	//public News findMaxTimestamp();

}
