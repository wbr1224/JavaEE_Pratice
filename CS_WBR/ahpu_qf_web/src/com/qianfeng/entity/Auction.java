package com.qianfeng.entity;

public class Auction {
	private int auctionid;
	private String auctionname;
	private double auctionstartprice;
	private double auctionupset;
	private java.sql.Timestamp auctionstarttime;
	private java.sql.Timestamp auctionendtime;
	private String auctiondesc;
	private java.sql.Timestamp createtime;
	private java.sql.Timestamp updatetime;
	
	public int getAuctionid() {
		return auctionid;
	}
	public void setAuctionid(int auctionid) {
		this.auctionid = auctionid;
	}
	public String getAuctionname() {
		return auctionname;
	}
	public void setAuctionname(String auctionname) {
		this.auctionname = auctionname;
	}
	public double getAuctionstartprice() {
		return auctionstartprice;
	}
	public void setAuctionstartprice(double auctionstartprice) {
		this.auctionstartprice = auctionstartprice;
	}
	public double getAuctionupset() {
		return auctionupset;
	}
	public void setAuctionupset(double auctionupset) {
		this.auctionupset = auctionupset;
	}
	public java.sql.Timestamp getAuctionstarttime() {
		return auctionstarttime;
	}
	public void setAuctionstarttime(java.sql.Timestamp auctionstarttime) {
		this.auctionstarttime = auctionstarttime;
	}
	public java.sql.Timestamp getAuctionendtime() {
		return auctionendtime;
	}
	public void setAuctionendtime(java.sql.Timestamp auctionendtime) {
		this.auctionendtime = auctionendtime;
	}
	public String getAuctiondesc() {
		return auctiondesc;
	}
	public void setAuctiondesc(String auctiondesc) {
		this.auctiondesc = auctiondesc;
	}
	public java.sql.Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(java.sql.Timestamp createtime) {
		this.createtime = createtime;
	}
	public java.sql.Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(java.sql.Timestamp updatetime) {
		this.updatetime = updatetime;
	}
	
	

}
