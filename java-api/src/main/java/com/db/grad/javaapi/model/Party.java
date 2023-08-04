package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "Party_details")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String ISSUER_NAME;
    private String TYPE;
    private String BOND_HOLDER;

    @Id
    @Column(name = "Id", nullable = false)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "ISSUER_NAME")
    public String getISSUER_NAME() {return ISSUER_NAME;
    }
    public void setISSUER_NAME(String ISSUER_NAME) { this.ISSUER_NAME = ISSUER_NAME;}


    @Column(name = "TYPE")
    public String getTYPE(String TYPE) {return TYPE;}
    public void setTYPE(String TYPE) { this.TYPE = TYPE;}

    @Column(name = "BOND_HOLDER")
    public String getBOND_HOLDER() {return BOND_HOLDER;}
    public void setBOND_HOLDER(String BOND_HOLDER){this.BOND_HOLDER = BOND_HOLDER;}


}
