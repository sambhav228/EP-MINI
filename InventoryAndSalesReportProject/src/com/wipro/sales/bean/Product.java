package com.wipro.sales.bean;

public class Product {
	private String productid;
	private String productname;
	private int quantityOnHand;
	private double ProductUnitPrice;
	private String reorderlevel;
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public double getProductUnitPrice() {
		return ProductUnitPrice;
	}
	public void setProductUnitPrice(double productUnitPrice) {
		ProductUnitPrice = productUnitPrice;
	}
	public String getReorderlevel() {
		return reorderlevel;
	}
	public void setReorderlevel(String reorderlevel) {
		this.reorderlevel = reorderlevel;
	}
	

}
