package com.wipro.sales.bean;

public class Sales {
	public String salesID;
	public String productid;
	private java.util.Date salesDate;
	private int quantitysold;
	private double salespriceperunit;
	public String getSalesID() {
		return salesID;
	}
	public void setSalesID(String salesID) {
		this.salesID = salesID;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public java.util.Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(java.util.Date salesDate) {
		this.salesDate = salesDate;
	}
	public int getQuantitysold() {
		return quantitysold;
	}
	public void setQuantitysold(int quantitysold) {
		this.quantitysold = quantitysold;
	}
	public double getSalespriceperunit() {
		return salespriceperunit;
	}
	public void setSalespriceperunit(double salespriceperunit) {
		this.salespriceperunit = salespriceperunit;
	}
	
	
	

}
