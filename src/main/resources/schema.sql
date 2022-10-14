DROP TABLE IF EXISTS `STOCK`;
CREATE TABLE STOCK(
    seqno INT AUTO_INCREMENT  PRIMARY KEY,
	brokerid varchar(5), 
	brokername varchar(20),
	opendate date,
	address varchar(255),
	tel varchar(20)
);