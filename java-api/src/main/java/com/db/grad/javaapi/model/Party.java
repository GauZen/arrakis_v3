package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Partydetails")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String issuerName;
    private String type;
    private String bondHolder;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

//    @OneToOne(mappedBy = "PARTY_ID", cascade = CascadeType.ALL)
//    private Set<Trade> Trade;

    @Column(name = "ISSUER_NAME")
    public String getIssuerName() {return issuerName;
    }
    public void setIssuerName(String issuerName) { this.issuerName =issuerName;}


    @Column(name = "TYPE")
    public String getType(String type) {return type;}
    public void setType(String type) { this.type = type;}

    @Column(name = "BOND_HOLDER")
    public String getBondHolder() {return bondHolder;}
    public void setBondHolder(String bondHolder){this.bondHolder = bondHolder;}


}
