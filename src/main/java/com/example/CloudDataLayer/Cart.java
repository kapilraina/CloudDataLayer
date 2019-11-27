package com.example.CloudDataLayer;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private long id;
	private List<Product> products = new ArrayList<Product>();
	private double carttotal;
	public Cart(List<Product> products, double carttotal) {
		super();
		this.products = products;
		this.carttotal = carttotal;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public double getCarttotal() {
		return carttotal;
	}
	public void setCarttotal(double carttotal) {
		this.carttotal = carttotal;
	}
	public Cart(long id, List<Product> products, double carttotal) {
		super();
		this.id = id;
		this.products = products;
		this.carttotal = carttotal;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
