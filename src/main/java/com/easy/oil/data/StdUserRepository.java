package com.easy.oil.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdUserRepository extends JpaRepository<StdUser, Long>{

}