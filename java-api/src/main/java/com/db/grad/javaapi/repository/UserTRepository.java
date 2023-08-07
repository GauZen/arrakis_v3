package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.UserT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTRepository extends JpaRepository<UserT, Long> {

   // @Query("SELECT u FROM UserT u WHERE u.name =:name")
    public UserT getUserByName(String name);
}
