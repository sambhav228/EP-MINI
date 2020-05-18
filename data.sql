drop table TBL_STOCK;
drop table TBL_SALES;
create table TBL_STOCK(
product_id varchar(6),
product_name varchar(20);
quantity_on_hand number,
product_unit_price number,
reorder_level number,
constraint pk00 primary key(product_id),
constraint uq01 unique(product_name),
constraint ch02 check(quantity_on_hand>=0),
constraint ch03 check(product_unit_price>=0)
);
create table TBL_SALES(
sales_id varchar2(6),
sales_date Date,
product_id number,
quantity_sold number,
sales_price_per_unit number,
constraint pk01 primary key(sales_id),
constraint fk11 foreign key(product_id),
constraint ch05 check(quantity_sold>0),
constraint ch06 check(sales_price_per_unit>0)
);
insert into TBL_STOCK values('RE1001','REDMI NOTE 3',20,12000,5);
insert into TBL_STOCK values('IP1002','IPHONE 5S',10,21000,2);
insert into TBL_STOCK values('PA1003','PANASONIC P55',50,5500,5);

drop sequence SEQ_SALES_ID;
drop sequence SEQ_PRODUCT_ID;
create sequence with SEQ_SALES_ID start with 1000 Increment by 1;
create sequence with SEQ_PRODUCT_ID start with 1004 Increment by 1;

drop view V_SALES_REPORT;
create view V_SALES_REPORT as
	select sales_id, sales_date, product_id,product_name,quantity_sold, product_unit_price ,sales_price_per_unit ,(,sales_price_per_unit - product_unit_price ) Profit_Amount from TBL_STOCK natural join TBL_SALES
order by Profit_Amount desc, sales_id asc;


