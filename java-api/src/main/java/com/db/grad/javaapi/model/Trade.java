package com.db.grad.javaapi.model;



import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "Trade")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    private long BOOK_ID;
//    private long SECURITY_ID;
//    private long PARTYDETAILS_ID;
    private String bookName;

    private String tradeCurrency;
    private long quantity;
    private Date tradeSettlementDate;
    private String tradeStatus;
    private String tradetype;
    private Date tradeDate;
    private double unitPrice;
    private double couponPercent;
    private String bondHolder;

//    @ManyToOne
//    private Bond bond;

    @ManyToMany
    @JoinTable(name = "BOND_DETAILS",
            joinColumns = @JoinColumn(name = "BOND_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "id"))
    private Set<Bond> bond;

    @ManyToMany
    @JoinTable(name = "PARTYDETAILS",
            joinColumns = @JoinColumn(name = "PARTYDETAILS_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "PARTY_ID", referencedColumnName = "id"))
    private Set<Party> Party;
    @ManyToMany
    @JoinTable(name = "SECURITY",
            joinColumns = @JoinColumn(name = "SECURITY_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "SECURITY_ID", referencedColumnName = "id"))
    private Set<Security> security;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
//    @Column(name = "BOOK_ID", nullable = false)

//    @OneToOne
//    @JoinColumn(name = "BOOK_ID")
//    private Bond BOND_ID;
//
//    @OneToOne
//    @JoinColumn(name = "SECURE_ID")
//    private Security SECURE_ID;
//
//    @OneToOne
//    @JoinColumn(name = "PARTY_ID")
//    private Party PARTY_ID;

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

    @Column(name = "TRADE_TYPE")
    public String getTradetype(String tradetype) {return tradetype;}
    public void setTradetype(String tradetype) { this.tradetype = tradetype;}
    @Column(name = "TRADE_DATE", nullable = false)
    public Date getTradeDate(String tradeDate) {
        return this.tradeDate;
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
    @Column(name = "COUPON_PERCENT", nullable = false)
    public double getCouponPercent() {
        return couponPercent;
    }

    public void setCouponPercent(double couponPercent) {
        this.couponPercent = couponPercent;
    }
    @Column(name = "BOND_HOLDER", nullable = false)
    public String getBondHolder() {
        return bondHolder;
    }

    public void setBondHolder(String bondHolder) {
        this.bondHolder = bondHolder;
    }
}