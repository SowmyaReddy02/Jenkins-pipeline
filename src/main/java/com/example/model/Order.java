package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name="order1")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String orderName;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, String orderName) {
		super();
		this.id = orderId;
		this.orderName = orderName;
	}
	
	public Order(String orderName) {
		super();
		this.orderName = orderName;
	}
	
	public int getOrderId() {
		return id;
	}
	public void setOrderId(int orderId) {
		this.id = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	
	
}
