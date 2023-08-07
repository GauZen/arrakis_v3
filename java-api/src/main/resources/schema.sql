
DROP TABLE IF EXISTS BOND_DETAILS;

CREATE TABLE BOND_DETAILS (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    TRADE_CURRENCY VARCHAR(255) NOT NULL,
    FACE_VALUE INT NOT NULL,
    BOND_MATURITY_DATE DATE,
    CUSIP VARCHAR(255),
    ISIN VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS USERT;

CREATE TABLE USERT (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    ROLE VARCHAR(255) NOT NULL,
    PASSWORD VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS BOOK_USER;
CREATE TABLE BOOK_USER (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    BOOK_ID INT NOT NULL,
    USER_ID INT NOT NULL
--    FOREIGN KEY(BOOK_ID ) REFERENCES BOND_DETAILS(ID),
--    FOREIGN KEY(USER_ID ) REFERENCES USERT(ID)
);

DROP TABLE IF EXISTS PARTYDETAILS;
CREATE TABLE PARTYDETAILS (
    ID INT PRIMARY KEY AUTO_INCREMENT ,
    ISSUER_NAME VARCHAR(255) NOT NULL,
    TYPE VARCHAR(255) NOT NULL,
    BOND_HOLDER VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS SECURITY;

CREATE TABLE SECURITY (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    TRADE_CURRENCY VARCHAR(255) NOT NULL,
    FACE_VALUE INT NOT NULL,
    BOND_MATURITY_DATE DATE,
    CUSIP VARCHAR(255) NOT NULL,
    ISIN VARCHAR(255) NOT NULL,
    ISSUER_NAME VARCHAR(255) NOT NULL,
    TRADE_STATUS VARCHAR(255) NOT NULL,
    TRADE_TYPE VARCHAR(255) NOT NULL,
    COUPON_PERCENT FLOAT NOT NULL
);

DROP TABLE IF EXISTS TRADE;

CREATE TABLE TRADE (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    BOOK_NAME VARCHAR(255) NOT NULL,
    TRADE_CURRENCY VARCHAR(255) NOT NULL,
    QUANTITY INT NOT NULL,
    TRADE_SETTLEMENT_DATE DATE NOT NULL,
    TRADE_STATUS VARCHAR(255) NOT NULL,
<<<<<<< HEAD
    TRADE_TYPE VARCHAR(255) NOT NULL,
=======
>>>>>>> livbranch2
    TRADE_DATE DATE NOT NULL,
    UNIT_PRICE FLOAT NOT NULL,
    COUPON_PERCENT FLOAT NOT NULL,
    BOND_HOLDER VARCHAR(255) NOT NULL
);



--    BOOK_ID INT NOT NULL,
--    SECURITY_ID INT NOT NULL,
--    PARTYDETAILS_ID INT NOT NULL,
--    FOREIGN KEY(BOOK_ID ) REFERENCES BOND_DETAILS(ID),
--    FOREIGN KEY(SECURITY_ID ) REFERENCES SECURITY(ID),
--    FOREIGN KEY(PARTYDETAILS_ID ) REFERENCES PARTYDETAILS(ID)