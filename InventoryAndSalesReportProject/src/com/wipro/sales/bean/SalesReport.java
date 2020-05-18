package com.wipro.sales.bean;

public class SalesReport {

	public String salesID;
	public String productid;
	private java.util.Date salesDate;
	private int quantitysold;
	private double salespriceperunit;
	private String productname;
	private double ProductUnitPrice;
	private double profitAmount;
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
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductUnitPrice() {
		return ProductUnitPrice;
	}
	public void setProductUnitPrice(double productUnitPrice) {
		ProductUnitPrice = productUnitPrice;
	}
	public double getProfitAmount() {
		return profitAmount;
	}
	public void setProfitAmount(double profitAmount) {
		this.profitAmount = profitAmount;
	}
	
	
}
