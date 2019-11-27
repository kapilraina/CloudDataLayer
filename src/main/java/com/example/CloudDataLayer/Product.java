package com.example.CloudDataLayer;

public class Product {
	
	private String id;
	private String name;
	private String category;
	private double saleprice;
	private double checkoutprice;
	private int quantity;
	private double total;
	public Product(String id, String name, String category, double saleprice, double checkoutprice, int quantity,
			double total) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.saleprice = saleprice;
		this.checkoutprice = checkoutprice;
		this.quantity = quantity;
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}
	public double getCheckoutprice() {
		return checkoutprice;
	}
	public void setCheckoutprice(double checkoutprice) {
		this.checkoutprice = checkoutprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
