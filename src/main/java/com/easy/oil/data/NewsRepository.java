package com.easy.oil.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.easy.oil.data.News;

@Transactional(readOnly=true)
public interface NewsRepository extends CrudRepository<News, Long>{
	
	@Query("SELECT n From News n WHERE n.timestmp = (SELECT max(n.timestmp) FROM News n")
	News latest();

}
