package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "trade")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "TRADE_CURRENCY")
    private String tradeCurrency;

    @Column(name = "QUANTITY")
    private long quantity;
    @Column(name = "TRADE_SETTLEMENT_DATE")
    private Date tradeSettlementDate;

    @Column(name = "TRADE_STATUS")
    private String tradeStatus;

    @Column(name = "TRADE_DATE")
    private Date tradeDate;
    @Column(name = "UNIT_PRICE")
    private double unitPrice;

    @Column(name = "CUPON_PERCENT")
    private double cuponPercent;
    @Column(name = "BOND_HOLDER")
    private String bondHolder;

    @ManyToOne
    private Bond bond;

    @ManyToOne
    @JoinColumn(name = "PARTYDETAILS")
    private CounterParty counterParty;
    @ManyToOne
    @JoinColumn(name = "SECURITY_ID")
    private Security security;

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public CounterParty getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(CounterParty counterParty) {
        this.counterParty = counterParty;
    }

    public Bond getBond() {
        return bond;
    }

    public void setBond(Bond bond) {
        this.bond = bond;
    }

    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Column(name = "BOOK_NAME", nullable = false)
    public String getBOOK_NAME() {
        return bookName;
    }

    public void setBOOK_NAME(String bookName) {
        this.bookName = bookName;
    }
    @Column(name = "TRADE_CURRENCY", nullable = false)
    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }
    @Column(name = "QUANTITY", nullable = false)
    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    @Column(name = "TRADE_SETTLEMENT_DATE", nullable = false)
    public Date getTradeSettlementDate() {
        return tradeSettlementDate;
    }

    public void setTradeSettlementDate(Date tradeSettlementDate) {
        this.tradeSettlementDate = tradeSettlementDate;
    }
    @Column(name = "TRADE_STATUS", nullable = false)
    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
    @Column(name = "TRADE_DATE", nullable = false)
    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }
    @Column(name = "UNIT_PRICE", nullable = false)
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    @Column(name = "CUPON_PERCENT", nullable = false)
    public double getCuponPercent() {
        return cuponPercent;
    }

    public void setCuponPercent(double cuponPercent) {
        this.cuponPercent = cuponPercent;
    }
    @Column(name = "BOND_HOLDER", nullable = false)
    public String getBondHolder() {
        return bondHolder;
    }

    public void setBondHolder(String bondHolder) {
        this.bondHolder = bondHolder;
    }
}
