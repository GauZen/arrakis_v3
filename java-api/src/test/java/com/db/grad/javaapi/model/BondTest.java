package com.db.grad.javaapi.model;

import org.junit.Before;

class BondTest {
    private Bond bond;

    @Before
    void setUp(){
        // create
        bond = new Bond();
        bond.setTRADE_CURRENCY("USD");
    }


}