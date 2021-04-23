package com.TechM.PointOfSale.beans;

import java.io.Serializable;

public class Customer implements Serializable{
	
	//Instance variables...
	private int customerId;
	private String customerName;
	
	//Constructors...
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	//Getters and Setters for injecting the dependency property values..
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
