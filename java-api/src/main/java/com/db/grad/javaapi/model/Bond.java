package com.db.grad.javaapi.model;



import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "BOND_DETAILS")
public class Bond {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "TRADE_CURRENCY", nullable = false)
    private String tradeCurrency;

    @Column(name = "FACE_VALUE", nullable = false)
    private long faceValue;

    @Column(name = "BOND_MATURITY_DATE")
    private Date bondMaturityDate;

    @Column(name = "CUSIP")
    private String cusip;

    @Column(name = "ISIN", nullable = false)
    private String isin;

    @ManyToMany(mappedBy = "bonds")
    private Set<UserT> users = new HashSet<>();

    @OneToMany(mappedBy = "bond", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Trade> trades = new HashSet<>();


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
        this.tradeCurrency = tradeCurrency;
    }

    @Column(name = "FACE_VALUE", nullable = false)
    public long getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(long faceValue) {
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
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }
}
