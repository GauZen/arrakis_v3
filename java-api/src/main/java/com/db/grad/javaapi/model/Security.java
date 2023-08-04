package com.db.grad.javaapi.model;



import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "Security")
public class Security
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String TRADE_CURRENCY;
    private long FACE_VALUE;
    private Date BOND_MATURITY_DATE;
    private String CUSIP;

    private String ISIN;
    private String ISSUER_NAME;
    private String TRADE_STATUS;
    private String TRADE_TYPE;
    private Float COUPON_PERCENT;




    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "TRADE_CURRENCY", nullable = false)
    public String getTRADE_CURRENCY() {
        return TRADE_CURRENCY;
    }
    public void setTRADE_CURRENCY(String TRADE_CURRENCY) {
        this.TRADE_CURRENCY = TRADE_CURRENCY;
    }

    @Column(name = "FACE_VALUE", nullable = false)
    public long getFACE_VALUE() {
        return FACE_VALUE;
    }
    public void setFACE_VALUE(long FACE_VALUE) {
        this.FACE_VALUE = FACE_VALUE;
    }

    @Column(name="BOND_MATURITY_DATE")
    public Date getBOND_MATURITY_DATE() {
        return BOND_MATURITY_DATE;
    }

    public void setBOND_MATURITY_DATE(Date BOND_MATURITY_DATE) {
        this.BOND_MATURITY_DATE = BOND_MATURITY_DATE;
    }

    @Column(name="CUSIP")
    public String getCUSIP() {
        return CUSIP;
    }

    public void setCUSIP(String CUSIP) {
        this.CUSIP = CUSIP;
    }

    @Column(name="ISIN")
    public String getISIN(String ISIN) {
        return this.ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    @Column(name = "ISSUER_NAME")
    public String getISSUER_NAME() {return ISSUER_NAME;
    }
    public void setISSUER_NAME(String ISSUER_NAME) { this.ISSUER_NAME = ISSUER_NAME;}

    @Column(name = "TRADE_TYPE")
    public String getTRADE_TYPE(String TRADE_TYPE) {return TRADE_TYPE;}
    public void setTRADE_TYPE(String TRADE_TYPE) { this.TRADE_TYPE = TRADE_TYPE;}

    @Column(name = "TRADE_STATUS")
    public String getTRADE_STATUS(String TRADE_STATUS) {return TRADE_STATUS;}
    public void setTRADE_STATUS(String TRADE_STATUS) { this.TRADE_STATUS = TRADE_STATUS;}

    @Column(name = "COUPON_PERCENT")
    public Float getCOUPON_PERCENT(Float COUPON_PERCENT) {return COUPON_PERCENT;}
    public void setCOUPON_PERCENT(Float COUPON_PERCENT) { this.COUPON_PERCENT = COUPON_PERCENT;}
}
