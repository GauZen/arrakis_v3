--INSERT INTO BOND_DETAILS (TRADE_CURRENCY, FACE_VALUE, BOND_MATURITY_DATE,
--CUSIP, ISIN) VALUES ('USD', 1000, '2021-08-05', ' ' , 'XS1988387210');

INSERT INTO BOND_DETAILS (TRADE_CURRENCY, FACE_VALUE, BOND_MATURITY_DATE,
CUSIP, ISIN) VALUES
('USD', 1000, '2021-08-05', '  ', 'XS1988387210'),
('GBP', 1000, '2021-08-05', '  ', 'XS1988387210'),
('GBP', 900, '2021-08-05', '123456780', 'USN0280EAR64'),
('USD',	900, '2021-07-30', '123456780', 'USN0280EAR64'),
('GBP',	900, '2021-07-30', '123456bh0', 'A12356111'),
('USD',	900, '2021-09-30', '123456780', 'USN0280EAR64'),
('USD',	900, '2021-07-30' , '123456bh0','A12356111'),
('GBP',	900, '2021-08-03', 'AMZN 3.15 08/22/27 REGS', 'USU02320AG12'),
('USD',	900, '2021-08-03', 'AMZN 3.15 08/22/27 REGS', 'GB00B6460505'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460506'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460507'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460508'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460509'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460510'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460511'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460512'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460513'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460514'),
('GBP',	900, '2021-08-09', 'BDCHBW8', 'GB00B6460515'),
('GBP',	690, '2021-08-09', 'BDCHBW8', 'US87973RAA86'),
('USD',	690, '2021-08-06', '87973RAA8', 'US87973RAA86'),
('USD',	690, '2021-08-06', '87973RAA8', 'US87973RAA86'),
('USD',	690, '2021-08-06', '87973RAA8', 'US87973RAA86'),
('USD',	340, '2030-12-22', '87973RAA8', 'IE00B29LNP31'),
('USD',	340, '2030-12-22', '87973RAA8', 'IE00B29LNP31'),
('USD',	340, '2030-12-22', '87973RAA8', 'IE00B29LNP31'),
('USD',	340, '2030-12-22', '87973RAA8', 'IE00B29LNP31');


INSERT INTO role (name) VALUES ('USER');
INSERT INTO role (name) VALUES ('CREATOR');
INSERT INTO role (name) VALUES ('EDITOR');
INSERT INTO role (name) VALUES ('ADMIN');

INSERT INTO UserT (name, email, password) VALUES ('nilesh', 'nilesh@gmail.com','$2a$10$EX164tCWdXqdqGtzDQhIzeK4MOJPbXkZfl8kaibCnpJt86MvTsgYG');
INSERT INTO UserT (name, email, password) VALUES ('mahesh', 'mahesh@gmail.com','$2a$10$2E5t2dQXROyfPE4cgnS71uIFfkwDIxRXkjW4CUaH8Bri/769F6omS');
INSERT INTO UserT (name, email, password) VALUES ('suresh', 'suresh@gmail.com','$2a$10$HFAy2cExzPXLMAkP7o8S6esRtJxNr/0xWudwD/a.njWDMtZ3eoLD6');
INSERT INTO UserT (name, email, password) VALUES ('ramesh', 'ramesh@gmail.com','$2a$10$2fv0qjzoOp911d.CwUuV4eJhygYyx0C/0WwUCIdSzy.oggx5BRULG');
INSERT INTO UserT (name, email, password) VALUES ('admin',  'admin@gmail.com','$2a$10$3rMX8tdEW94NpkyUSIjO7uexpTTlyiaT6BWAFnNsnxQUu01/ewiaC');

INSERT INTO USERT_ROLE (USERT_ID, ROLE_ID) VALUES (1, 1);
INSERT INTO USERT_ROLE (USERT_ID, ROLE_ID) VALUES (2, 2);
INSERT INTO USERT_ROLE (USERT_ID, ROLE_ID) VALUES (3, 3);
INSERT INTO USERT_ROLE (USERT_ID, ROLE_ID) VALUES (4, 2);
INSERT INTO USERT_ROLE (USERT_ID, ROLE_ID) VALUES (4, 3);
INSERT INTO USERT_ROLE (USERT_ID, ROLE_ID) VALUES (5, 4);

INSERT INTO BOOK_USER (BOOK_ID, USER_ID) VALUES (1, 1);
INSERT INTO BOOK_USER (BOOK_ID, USER_ID) VALUES (2, 2);
INSERT INTO BOOK_USER (BOOK_ID, USER_ID) VALUES (3, 3);
INSERT INTO BOOK_USER (BOOK_ID, USER_ID) VALUES (4, 2);
INSERT INTO BOOK_USER (BOOK_ID, USER_ID) VALUES (4, 3);
INSERT INTO BOOK_USER (BOOK_ID, USER_ID) VALUES (5, 4);

--INSERT INTO TRADE (BOOK_ID,  SECURITY_ID , PARTYDETAILS_ID, BOOK_NAME, TRADE_CURRENCY, QUANTITY,
--TRADE_SETTLEMENT_DATE, TRADE_STATUS, TRADE_TYPE, TRADE_DATE, UNIT_PRICE, COUPON_PERCENT,
--BOND_HOLDER) VALUES
--(1,1,1,'trading_book_1', 'USD', 50,  '2021-08-04', 'open', 'buy', '2021-05-13', 90.0, 4.37, 'AZ Holdings Inc' ),
--(2,2,2,'trading_book_1', 'GBP', 40,  '2021-08-04', 'open', 'sell','2021-02-04', 89.56, 4.37, 'AZ Holdings Inc'),
--(3,3,3, 'trading_book_2', 'USD', 1000,'2021-08-23', 'open', 'buy', '2021-05-13', 105.775,3.15, 'Acme co');
----('trading_book_2', 'GBP', 900, '2021-09-10', 'open', 'sell','2021-02-04', 105.775,3.15, 'Acme Co');
--('Trading_book_3', 'USD', 50,  '2021-08-23', 'open', 'buy', '2021-05-13', 90.0,	2.0,  'Sovereign Investments'),
--('trading_book_2', 'USD', 1000,'2021-08-23', 'open', 'buy', '2021-05-13', 105.775,3.15, 'Astra Trading Ltd'),
--('Trading_book_2', 'USD', 50,  '2021-08-23', 'open', 'sell','2021-05-13', 90.0, 2.0,'Sovereign Investments'),
--('Trading_book_4', 'GBP', 60,  '2021-09-27', 'open', 'buy', '2021-04-04', 98.56,3.15,'Muncipal Gov Of Orange County'),
--('Trading_book_4', 'USD', 50,  '2021-08-23','open', 'buy', '2021-08-23', 98.56, 3.15,'Muncipal Gov Of Orange County'),
--('Trading_book_6', 'GBP', 1100,'2021-09-27','open', 'buy', '2021-09-27', 110.35,0.75,'Goldman Sachs'),
--('Trading_book_6', 'GBP', 900, '2021-09-28','open',	'sell','2021-09-28', 110.35,0.75,'Goldman Sachs'),
--('Trading_book_6', 'GBP', 2000,'2021-09-29','open',	'buy', '2021-09-29', 110.35,0.75,'UBS'),
--('Trading_book_6', 'GBP', 2000,'2021-09-30','open',	'sell','2021-09-30', 110.35,0.75,'UBS'),
--('Trading_book_6', 'GBP', 1000,'2021-10-01','open',	'buy', '2021-10-01', 110.35,0.75,'Barclays'),
--('Trading_book_6', 'GBP', 900, '2019-10-02','open',	'buy', '2019-10-02', 110.35,0.75,'Barclays'),
--('Trading_book_6', 'GBP', 1900,'2019-10-02','open',	'sell','2019-10-03', 110.35,0.75,	'Barclays'),
--('Trading_book_6', 'GBP', 600, '2018-10-04','open',	'buy', '2018-10-04', 110.35,0.75,'British Telecom'),
--('Trading_book_6', 'GBP', 600, '2019-10-05','open',	'buy', '2019-10-05', 110.35,0.75,'Pension Holdings'),
--('Trading_book_6', 'GBP', 700, '2021-10-06','open',	'buy', '2021-06-06', 110.35,0.75,'Pension Holdings'),
--('Trading_book_6', 'GBP', 1300,'2021-10-07','open',	'sell','2011-10-07', 110.35,0.75,'Pension Holdings'),
--('Trading_book_4', 'USD', 60,  '2021-09-27','open', 'buy', '2012-02-04', 100.13,2.02,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 50,  '2021-08-23','open',	'buy', '2012-08-23', 100.13,2.02,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 75,  '2021-09-27','open',	'buy', '2013-02-04', 100.13,2.02,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 50,  '2021-08-23','open',	'buy', '2014-08-23', 100.13,2.02,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 300, '2021-09-27','open',	'buy', '2016-02-04', 98.76,1.123,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 300, '2021-08-23','open',	'buy', '2012-08-23', 98.76,1.123,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 300, '2021-09-27','open',	'buy', '2013-02-04', 98.76,1.123,'Zurich Pension fund 4'),
--('Trading_book_4', 'USD', 300, '2021-08-23','open',	'sell','2015-08-23', 98.76,1.123,'Zurich Pension fund 4');
