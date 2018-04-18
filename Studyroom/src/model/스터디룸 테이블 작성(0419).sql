--고객테이블 시퀀스

CREATE SEQUENCE seq_cus
START  WITH 1
INCREMENT BY 1
NOMAXVALUE;

--사원테이블 시퀀스
CREATE SEQUENCE seq_emp
START WITH 1
INCREMENT BY 1
NOMAXVALUE;

--예약테이블 시퀀스
CREATE SEQUENCE seq_rev
START  WITH 1
INCREMENT BY 1
NOMAXVALUE;

--주문테이블 시퀀스
CREATE SEQUENCE seq_ord
START  WITH 1
INCREMENT BY 1
NOMAXVALUE;

--결제테이블 시퀀스
CREATE SEQUENCE seq_pay
START  WITH 1
INCREMENT BY 1
NOMAXVALUE;

--물품테이블 시퀀스
CREATE SEQUENCE seq_god
START  WITH 1
INCREMENT BY 1
NOMAXVALUE;
----------------------------------------------------------------------

--고객테이블
CREATE TABLE customer(C_NUM number CONSTRAINT pk_customer_cnum primary key, 
 C_NAME varchar2(20) NOT NULL, C_TEL varchar2(30) NOT NULL, C_ADR varchar2(50), C_MAIL varchar2(30));


--사원테이블
CREATE TABLE emp(E_NUM number CONSTRAINT pk_emp_enum primary key, E_ID varchar2(20) CONSTRAINT uk_emp_eid UNIQUE, 
E_PASS varchar2(30), E_NAME varchar2(20) NOT NULL, E_TEL varchar2(30) NOT NULL, E_DEPT varchar2(20));
 
 
 --물품테이블
CREATE TABLE good(G_NUM number CONSTRAINT pk_good_gnum primary key, G_NAME varchar2(20), G_PRICE number);
 
 
--주문테이블
CREATE TABLE ord(O_NUM number CONSTRAINT pk_order_onum primary key, 
G_NUM number CONSTRAINT fk_ord_gnum  REFERENCES good(G_NUM),
E_COUNT number, E_PAY char(1) CONSTRAINT bool_order_epay CHECK(e_pay in ('Y','N')));


--예약테이블
CREATE TABLE reservation(R_NUM number CONSTRAINT pk_reservation_rnum primary key, 
 E_NUM number CONSTRAINT fk_reservation_enum  REFERENCES emp(e_num), 
 C_NUM number CONSTRAINT fk_reservation_cnum  REFERENCES customer(c_num),
 O_NUM number CONSTRAINT fk_reservation_onum REFERENCES ord(o_num),
 R_ROOM number, R_TDATE date, R_START date, R_END date);

--결제테이블
CREATE TABLE pay(P_NUM number CONSTRAINT pk_pay_pnum primary key, 
R_NUM number CONSTRAINT fk_pay_rnum REFERENCES reservation(r_num),
P_WAY char(4) CONSTRAINT bool_pay_pway CHECK(p_way in ('현금','카드')),
P_DATE date, P_PRICE number);

 -------------------------------------------------------------------------------
 --고객 정보, 사원정보 입력
INSERT into customer(c_num, c_name , c_tel, c_adr, c_mail) VALUES(seq_cus.nextval,'홍길동', '02-222-2222', '서울', 'abc@multi.com');  
INSERT into customer(c_num, c_name , c_tel) VALUES(seq_cus.nextval,'홍길순', '02-333-3333');

INSERT into emp(e_num,  E_ID, e_pass ,e_name, e_tel, e_dept )
 VALUES(seq_emp.nextval,'admin', 'tiger', '고길동','02-444-4444', 'mgr');

INSERT into emp(e_num,  E_ID, e_pass ,e_name, e_tel, e_dept )
 VALUES(seq_emp.nextval,'scott', 'tiger', '최길동','02-555-5555', 'emp');

SELECT C_TEL FROM customer WHERE C_NUM=7;
 


