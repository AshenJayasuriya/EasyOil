package com.easy.oil.data;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.easy.oil.data.News;

//@Transactional(readOnly=true)
public interface NewsRepository extends CrudRepository<News, Long>{
	
	@Query("SELECT n FROM News n WHERE n.timestmp = (SELECT max(n.timestmp) FROM News n)")
	News findLatest();
	
}
/*SELECT c.name FROM Country c ORDER BY c.name DESC*/