package com.db.grad.javaapi.repository;


import com.db.grad.javaapi.model.Bond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BondsRepository extends JpaRepository<Bond, Long>
{
    @Query(nativeQuery = true, value = "select * from Bond where ISIN = :ISIN")
    List<Bond> findByISIN(Bond ISIN);


}