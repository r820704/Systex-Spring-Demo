DROP TABLE IF EXISTS `STOCK`;
CREATE TABLE STOCK(
    seqno INT AUTO_INCREMENT  PRIMARY KEY,
	id varchar(10) NOT NULL, 
	stockname varchar(50),
	price varchar(50),
	capitalstock  varchar(50),
	type varchar(50),
	representative varchar(50)
);