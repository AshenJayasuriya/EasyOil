package com.easy.oil.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdUserRepository extends CrudRepository<StdUser, Long>{

}