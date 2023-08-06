package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Trade")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long BOOK_ID;
    private long SECURITY_ID;
    private long PARTYDETAILS_ID;
    private String BOOK_NAME;

    private String TRADE_CURRENCY;
    private long QUANTITY;
    private Date TRADE_SETTLEMENT_DATE;
    private String TRADE_STATUS;
    private Date TRADE_DATE;
    private double UNIT_PRICE;
    private double CUPON_PERCENT;
    private String BOND_HOLDER;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "BOOK_ID", nullable = false)

    public long getBOOK_ID() {
        return BOOK_ID;
    }

    public void setBOOK_ID(long BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    @Column(name = "SECURITY_ID", nullable = false)
    public long getSECURITY_ID() {
        return SECURITY_ID;
    }

    public void setSECURITY_ID(long SECURITY_ID) {
        this.SECURITY_ID = SECURITY_ID;
    }
    @Column(name = "PARTYDETAILS_ID", nullable = false)
    public long getPARTYDETAILS_ID() {
        return PARTYDETAILS_ID;
    }

    public void setPARTYDETAILS_ID(long PARTYDETAILS_ID) {
        this.PARTYDETAILS_ID = PARTYDETAILS_ID;
    }
    @Column(name = "BOOK_NAME", nullable = false)
    public String getBOOK_NAME() {
        return BOOK_NAME;
    }

    public void setBOOK_NAME(String BOOK_NAME) {
        this.BOOK_NAME = BOOK_NAME;
    }
    @Column(name = "TRADE_CURRENCY", nullable = false)
    public String getTRADE_CURRENCY() {
        return TRADE_CURRENCY;
    }

    public void setTRADE_CURRENCY(String TRADE_CURRENCY) {
        this.TRADE_CURRENCY = TRADE_CURRENCY;
    }
    @Column(name = "QUANTITY", nullable = false)
    public long getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(long QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
    @Column(name = "TRADE_SETTLEMENT_DATE", nullable = false)
    public Date getTRADE_SETTLEMENT_DATE() {
        return TRADE_SETTLEMENT_DATE;
    }

    public void setTRADE_SETTLEMENT_DATE(Date TRADE_SETTLEMENT_DATE) {
        this.TRADE_SETTLEMENT_DATE = TRADE_SETTLEMENT_DATE;
    }
    @Column(name = "TRADE_STATUS", nullable = false)
    public String getTRADE_STATUS() {
        return TRADE_STATUS;
    }

    public void setTRADE_STATUS(String TRADE_STATUS) {
        this.TRADE_STATUS = TRADE_STATUS;
    }
    @Column(name = "TRADE_DATE", nullable = false)
    public Date getTRADE_DATE() {
        return TRADE_DATE;
    }

    public void setTRADE_DATE(Date TRADE_DATE) {
        this.TRADE_DATE = TRADE_DATE;
    }
    @Column(name = "UNIT_PRICE", nullable = false)
    public double getUNIT_PRICE() {
        return UNIT_PRICE;
    }

    public void setUNIT_PRICE(double UNIT_PRICE) {
        this.UNIT_PRICE = UNIT_PRICE;
    }
    @Column(name = "CUPON_PERCENT", nullable = false)
    public double getCUPON_PERCENT() {
        return CUPON_PERCENT;
    }

    public void setCUPON_PERCENT(double CUPON_PERCENT) {
        this.CUPON_PERCENT = CUPON_PERCENT;
    }
    @Column(name = "BOND_HOLDER", nullable = false)
    public String getBOND_HOLDER() {
        return BOND_HOLDER;
    }

    public void setBOND_HOLDER(String BOND_HOLDER) {
        this.BOND_HOLDER = BOND_HOLDER;
    }
}
