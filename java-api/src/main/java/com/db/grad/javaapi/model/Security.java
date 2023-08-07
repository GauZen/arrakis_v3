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
    @OneToOne(mappedBy = "SECURE_ID", cascade = CascadeType.ALL)
    private Trade Trade;
    private String tradeCurrency;
    private long faceValue;
    private Date bondMaturityDate;
    private String cusip;

    private String isin;
    private String issuerName;
    private String tradeStatus;
    private String tradeType;
    private Float couponPercent;




    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "TRADE_CURRENCY", nullable = false)
    public String getTradeCurrency() {
        return tradeCurrency;
    }
    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency= tradeCurrency;
    }

    @Column(name = "FACE_VALUE", nullable = false)
    public long getFaceValue() {
        return faceValue;
    }
    public void setFACE_VALUE(long FACE_VALUE) {
        this.faceValue = faceValue;
    }

    @Column(name="BOND_MATURITY_DATE")
    public Date getBondMaturityDate() {
        return bondMaturityDate;
    }

    public void setBondMaturityDate(Date bondMaturityDate) {
        this.bondMaturityDate = bondMaturityDate;
    }

    @Column(name="CUSIP")
    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    @Column(name="ISIN")
    public String getIsin(String isin) {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    @Column(name = "ISSUER_NAME")
    public String getIssuerName() {return issuerName;
    }
    public void setIssuerName(String issuerName) { this.issuerName = issuerName;}

    @Column(name = "TRADE_TYPE")
    public String getTradeType() {return tradeType;}
    public void setTradeType(String tradeType) { this.tradeType = tradeType;}

    @Column(name = "TRADE_STATUS")
    public String getTradeStatus(String tradeStatus) {return tradeStatus;}
    public void setTradeStatus(String tradeStatus) { this.tradeStatus= tradeStatus;}

    @Column(name = "COUPON_PERCENT")
    public Float getCouponPercent(Float couponPercent) {return couponPercent;}
    public void setCouponPercent(Float couponPercent) { this.couponPercent= couponPercent;}
}