package com.db.grad.javaapi.repository;


import com.db.grad.javaapi.model.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long>
{
    @Query(nativeQuery = true, value = "select * from Party where type = :type")
    List<Party> findBytype(Party type);
}
