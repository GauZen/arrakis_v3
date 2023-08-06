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
