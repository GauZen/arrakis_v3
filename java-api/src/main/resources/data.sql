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
('USD',	340, '2030-12-22', '87973RAA8', 'IE00B29LNP31'),
('USD', 1000, '2023-07-28', '  ', 'XS1988387210'),
('GBP', 1000, '2023-08-11', '  ', 'XS1988387210'),
('GBP', 900, '2023-08-04', '123456780', 'USN0280EAR64'),
('USD',	900, '2023-07-27', '123456780', 'USN0280EAR64'),
('GBP',	900, '2023-08-14', '123456bh0', 'A12356111');


INSERT INTO role (name) VALUES ('USER');
INSERT INTO role (name) VALUES ('CREATOR');
INSERT INTO role (name) VALUES ('EDITOR');
INSERT INTO role (name) VALUES ('ADMIN');


INSERT INTO UserT (name, email, password) VALUES ('ali', 'ali@gmail.com','$2a$10$qCwbNw8iMnCEwEXAWM17Sus0Rp6qcjW31HRV9zPsqnx1ILbmBtzXq');
INSERT INTO UserT (name, email, password) VALUES ('cen', 'cen@gmail.com','$2a$10$Ee0OBMXCjL3S7Wj.kvdDHuBDjourkkTne6DpLZi2UkZ5/Hd5aFIji');
INSERT INTO UserT (name, email, password) VALUES ('vinod', 'vinod@gmail.com','$2a$10$Ee0OBMXCjL3S7Wj.kvdDHuBDjourkkTne6DpLZi2UkZ5/Hd5aFIji');
INSERT INTO UserT (name, email, password) VALUES ('liviu', 'liviu@gmail.com','$2a$10$F0/uIBMjhfkdwEzuMCIf2O5aZAlz1tU/1mRot7C/3vPTSLjQSraee');
INSERT INTO UserT (name, email, password) VALUES ('admin',  'admin@gmail.com','$2a$10$nwg11Cr/f2VZvw1vWeXl1eLMyJD8jBybcAJBMi0Ti8ipetY4kGHT2');


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

INSERT INTO PARTYDETAILS(ISSUER_NAME, TYPE, BOND_HOLDER) VALUES
('BNPParibasIssu 4,37%  Microsoft Corp (USD)',    'CORP', 'AZ Holdings Inc'),
('BNPParibasIssu 4,37% Microsoft Corp (USD)',     'CORP', 'AZ Holdings Inc'),
('Airbus 3.15% USD',                              'CORP', 'Acme co'),
('Airbus 3.15% USD',                              'CORP', 'Acme co'),
('UBS Facebook (USD)',                            'CORP', 'Sovereign Investments'),
('Airbus 3.15%  USD',                             'CORP',	'Astra Trading Ltd'),
('UBS Facebook (USD)',                            'CORP',	'Sovereign Investments'),
('Amazon',                                        'CORP',	'Muncipal Gov Of Orange County'),
('Amazon',                                        'CORP',	'Muncipal Gov Of Orange County'),
('HM Treasury United Kingdom',                    'GOVN',	'Goldman Sachs'),
('HM Treasury United Kingdom',                    'GOVN',	'Goldman Sachs'),
('HM Treasury United Kingdom',                    'GOVN',	'UBS'),
('HM Treasury United Kingdom',                    'GOVN',	'UBS'),
('HM Treasury United Kingdom',                    'GOVN',	'Barclays'),
('HM Treasury United Kingdom',                    'GOVN',	'Barclays'),
('HM Treasury United Kingdom',                    'GOVN',	'Barclays'),
('HM Treasury United Kingdom',                    'GOVN',	'British Telecom'),
('HM Treasury United Kingdom',                    'GOVN',	'Pension Holdings'),
('HM Treasury United Kingdom',                    'GOVN',	'Pension Holdings'),
('HM Treasury United Kingdom',                    'GOVN',	'Pension Holdings'),
('First Norway Alpha Kl.IV',                      'SOVN', 'Zurich Pension fund 4'),
('First Norway Alpha Kl.IV',                      'SOVN', 'Zurich Pension fund 4'),
('First Norway Alpha Kl.IV',                      'SOVN', 'Zurich Pension fund 4'),
('First Norway Alpha Kl.IV',                      'SOVN', 'Zurich Pension fund 4'),
('TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', 'SOVN',	'Zurich Pension fund 4'),
('TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', 'SOVN',	'Zurich Pension fund 4'),
('TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', 'SOVN',	'Zurich Pension fund 4'),
('TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', 'SOVN',	'Zurich Pension fund 4');




INSERT INTO SECURITY(BOND_CURRENCY, coupon, BOND_MATURITY_DATE, type, status, FACE_VALUE, CUSIP, ISIN)
VALUES ('USD', 1000, '2021-08-05', 'open', '         ', 'XS1988387210', 4.37, 4.37),
       ('GBP', 1000, '2021-08-05', 'open', '         ', 'XS1988387210', 4.37, 4.37);
--('GBP', 900,  '2021-08-05',	'123456780','USN0280EAR64', 'Airbus 3.15% USD',                          'open', 'buy', 3.15),
--('USD',	900,  '2021-07-30',	'123456780','USN0280EAR64', 'Airbus 3.15% USD',                          'open','sell', 3.15),
--('GBP',	900,  '2021-07-30',	'123456bh0','A12356111',    'UBS Facebook (USD)',                        'open','buy',  2.0 ),
--('USD',	900,  '2021-09-30',	'123456780','USN0280EAR64', 'Airbus 3.15%  USD',                         'open','buy',  3.15),
--('USD',	900,  '2021-07-30',	'123456bh0','A12356111',    'UBS Facebook (USD)',                        'open','sell', 2.0 ),
--('GBP',	900,  '2021-08-03',	'AMZN 3.15 08/22/27 REGS',	'USU02320AG12', 'Amazon',                    'open','buy',  3.15),
--('USD', 900,  '2021-08-03', 'AMZN 3.15 08/22/27 REGS',  'USU02320AG12', 'Amazon',                    'open','buy',  3.15),
--('GBP',	900	, '2021-08-03',	'BDCHBW8',	'GB00B6460505', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460506', 'HM Treasury United Kingdom',                'open','sell', 0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460507', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460508', 'HM Treasury United Kingdom',                'open','sell', 0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460509', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460510', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460511', 'HM Treasury United Kingdom',                'open','sell', 0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460512', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460513', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460514', 'HM Treasury United Kingdom',                'open','buy',  0.75),
--('GBP',	900,  '2021-08-09',	'BDCHBW8',	'GB00B6460515', 'HM Treasury United Kingdom',                'open','sell', 0.75),
--('USD',	340,  '2030-12-22',	'87973RAA8','IE00B29LNP31', 'First Norway Alpha Kl.IV',                  'open','buy', 1.123),
--('USD',	340,  '2030-12-22',	'87973RAA8','IE00B29LNP31', 'First Norway Alpha Kl.IV',                  'open','buy', 1.123),
--('USD',	340,  '2030-12-22',	'87973RAA8','IE00B29LNP31', 'First Norway Alpha Kl.IV',                  'open','buy', 1.123),
--('USD',	340,  '2030-12-22',	'87973RAA8','IE00B29LNP31', 'First Norway Alpha Kl.IV',                  'open','sell',1.123),
--('GBP',	690,  '2021-08-09',	'BDCHBW8',	'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','open','buy',2.02),
--('USD',	690,  '2021-08-06',	'87973RAA8','US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','open','buy',2.02),
--('USD',	690,  '2021-08-06',	'87973RAA8','US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','open','buy',2.02),
--('USD',	690,  '2021-08-06',	'87973RAA8','US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','open','buy',2.02);


INSERT INTO TRADE (BOOK_ID,  SECURITY_ID , PARTYDETAILS_ID, BOOK_NAME, TRADE_CURRENCY, QUANTITY,
TRADE_SETTLEMENT_DATE, TRADE_STATUS, TRADE_TYPE, TRADE_DATE, UNIT_PRICE, COUPON_PERCENT,
BOND_HOLDER) VALUES
(1,1,1,'trading_book_1', 'USD', 50,  '2021-08-04', 'open', 'buy', '2021-05-13', 90.0, 4.37, 'AZ Holdings Inc' ),
(2,2,2,'trading_book_1', 'GBP', 40,  '2021-08-04', 'open', 'sell','2021-02-04', 89.56, 4.37, 'AZ Holdings Inc'),
(3,2,3, 'trading_book_2', 'USD', 1000,'2021-08-23', 'open', 'buy', '2021-05-13', 105.775,3.15, 'Acme co');

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

