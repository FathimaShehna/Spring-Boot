package com.example.lab8.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.lab8.models.MobilePhones;

public interface MobileRepository extends CrudRepository<MobilePhones,Integer> {

    @Query("SELECT m FROM MobilePhones m Where m.price < 20000")
    List<MobilePhones> findByPrice();
    
    @Query("SELECT m.type, COUNT(m) FROM MobilePhones m GROUP BY m.type")
    List<Object[]> findCountByType();
    
}