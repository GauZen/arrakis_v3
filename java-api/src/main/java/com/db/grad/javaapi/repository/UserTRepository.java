package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.UserT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTRepository extends JpaRepository<UserT, Long> {
}
