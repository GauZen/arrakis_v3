package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PARTYDETAILS")
public class CounterParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ISSUER_NAME")
    private String issuerName;
    @Column(name = "BOND_HOLDER")
    private String bondHolder;

    @Column(name = "TYPE")
    private String type;

    @OneToMany(mappedBy = "counterParty", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Trade> trades = new HashSet<>();



    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getBondHolder() {
        return bondHolder;
    }

    public void setBondHolder(String bondHolder) {
        this.bondHolder = bondHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Trade> getTrades() {
        return trades;
    }

    public void setTrades(Set<Trade> trades) {
        this.trades = trades;
    }
}