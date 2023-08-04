DROP DATABASE IF EXISTS `bonds`;
CREATE DATABASE `bonds`;
use bonds;

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
    PASSWORD VARCHAR(255) NOT NULL
);


CREATE TABLE BOOK_USER (
    BOOK_ID INT,
    USER_ID INT,
    FOREIGN KEY(BOOK_ID ) REFERENCES BOND_DETAILS(ID),
    FOREIGN KEY(USER_ID ) REFERENCES USERT(ID)
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
    BOND_CURRENCY VARCHAR(255) NOT NULL,
    coupon float NOT NULL,
    type varchar(255) not null,
    status varchar(32) default null,
    FACE_VALUE VARCHAR(255) NOT NULL,
    BOND_MATURITY_DATE DATE,
    CUSIP INT,
    ISIN INT NOT NULL
);

DROP TABLE IF EXISTS TRADE;

CREATE TABLE TRADE (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    BOOK_ID INT NOT NULL,
    SECURITY_ID INT NOT NULL,
    PARTYDETAILS_ID INT NOT NULL,
    BOOK_NAME VARCHAR(255) NOT NULL,
    TRADE_CURRENCY VARCHAR(255) NOT NULL,
    QUANTITY INT NOT NULL,
    TRADE_SETTLEMENT_DATE DATE NOT NULL,
    TRADE_STATUS VARCHAR(255) NOT NULL,
    TRADE_DATE DATETIME NOT NULL,
    UNIT_PRICE FLOAT NOT NULL,
    COUPON_PERCENT FLOAT NOT NULL,
    BOND_HOLDER VARCHAR(255) NOT NULL,
    FOREIGN KEY(BOOK_ID ) REFERENCES BOND_DETAILS(ID),
    FOREIGN KEY(SECURITY_ID ) REFERENCES SECURITY(ID),
    FOREIGN KEY(PARTYDETAILS_ID ) REFERENCES PARTYDETAILS(ID)
);




