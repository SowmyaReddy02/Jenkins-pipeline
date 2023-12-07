package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Order;
import com.example.repo.OrderRepo;
import com.example.response.OrderResponse;

@Service
public class OrderService {
	@Autowired
	OrderRepo orderRepo;
	
	public OrderResponse getById(int id) {
		Order order = orderRepo.findById(id).get();
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setId(order.getOrderId());
		orderResponse.setName(order.getOrderName());
		return orderResponse;
	}
}
