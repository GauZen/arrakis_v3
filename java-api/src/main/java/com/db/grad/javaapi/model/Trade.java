package com.db.grad.javaapi.model;

<<<<<<< HEAD


import javax.persistence.*;
import java.sql.Date;



@Entity
@Table(name = "Trade")
public class Trade {
=======
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Trade")
public class Trade {

>>>>>>> livbranch2
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long BOOK_ID;
    private long SECURITY_ID;
    private long PARTYDETAILS_ID;
    private String BOOK_NAME;

    private String TRADE_CURRENCY;
    private long QUANTITY;
    private Date TRADE_SETTLEMENT_DATE;
    private String TRADE_STATUS;
<<<<<<< HEAD
    private String TRADE_TYPE;
    private Date TRADE_DATE;
    private double UNIT_PRICE;
    private double COUPON_PERCENT;
=======
    private Date TRADE_DATE;
    private double UNIT_PRICE;
    private double CUPON_PERCENT;
>>>>>>> livbranch2
    private String BOND_HOLDER;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
<<<<<<< HEAD
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

=======
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
>>>>>>> livbranch2
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
<<<<<<< HEAD
    @Column(name = "TRADE_TYPE")
    public String getTRADE_TYPE(String TRADE_TYPE) {return TRADE_TYPE;}
    public void setTRADE_TYPE(String TRADE_TYPE) { this.TRADE_TYPE = TRADE_TYPE;}
    @Column(name = "TRADE_DATE", nullable = false)
    public Date getTRADE_DATE(String TRADE_DATE) {
        return this.TRADE_DATE;
=======
    @Column(name = "TRADE_DATE", nullable = false)
    public Date getTRADE_DATE() {
        return TRADE_DATE;
>>>>>>> livbranch2
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
<<<<<<< HEAD
    @Column(name = "COUPON_PERCENT", nullable = false)
    public double getCOUPON_PERCENT() {
        return COUPON_PERCENT;
    }

    public void setCOUPON_PERCENT(double COUPON_PERCENT) {
        this.COUPON_PERCENT = COUPON_PERCENT;
=======
    @Column(name = "CUPON_PERCENT", nullable = false)
    public double getCUPON_PERCENT() {
        return CUPON_PERCENT;
    }

    public void setCUPON_PERCENT(double CUPON_PERCENT) {
        this.CUPON_PERCENT = CUPON_PERCENT;
>>>>>>> livbranch2
    }
    @Column(name = "BOND_HOLDER", nullable = false)
    public String getBOND_HOLDER() {
        return BOND_HOLDER;
    }

    public void setBOND_HOLDER(String BOND_HOLDER) {
        this.BOND_HOLDER = BOND_HOLDER;
    }
}
<<<<<<< HEAD


=======
>>>>>>> livbranch2
