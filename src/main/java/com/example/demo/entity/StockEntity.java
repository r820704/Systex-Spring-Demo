package com.example.demo.entity;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class StockEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seqno;

	@Column
	private String brokerid;
	@Column
	private String brokername;
	@Column
	private Date opendate;
	@Column
	private String address;
	@Column
	private String tel;

	public Long getSeqno() {
		return seqno;
	}

	public void setSeqno(Long seqno) {
		this.seqno = seqno;
	}

	public String getBrokerid() {
		return brokerid;
	}

	public void setBrokerid(String brokerid) {
		this.brokerid = brokerid;
	}

	public String getBrokername() {
		return brokername;
	}

	public void setBrokername(String brokername) {
		this.brokername = brokername;
	}

	public Date getOpendate() {
		return opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "StockEntity [seqno=" + seqno + ", brokerid=" + brokerid + ", brokername=" + brokername + ", opendate="
				+ opendate + ", address=" + address + ", tel=" + tel + "]";
	}

	public StockEntity(Long seqno, String brokerid, String brokername, Date opendate, String address, String tel) {
		super();
		this.seqno = seqno;
		this.brokerid = brokerid;
		this.brokername = brokername;
		this.opendate = opendate;
		this.address = address;
		this.tel = tel;
	}

	public StockEntity() {
		super();
	}
	

}
