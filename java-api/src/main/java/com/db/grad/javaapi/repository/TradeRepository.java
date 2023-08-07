package com.db.grad.javaapi.repository;

<<<<<<< HEAD
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TradeRepository extends JpaRepository<Trade,Long> {
    @Query(nativeQuery = true, value = "select * from Trade where TRADE_DATE = :TRADE_DATE")
    List<Trade> findByTRADE_DATE(Trade TRADE_DATE);
}
=======
import com.db.grad.javaapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade,Long> {
}
>>>>>>> livbranch2
