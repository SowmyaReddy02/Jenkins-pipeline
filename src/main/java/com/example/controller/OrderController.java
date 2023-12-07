package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Order;
import com.example.model.User;
import com.example.response.OrderResponse;
import com.example.service.OrderService;

@RestController
@RequestMapping("api/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@GetMapping("getById/{id}")
	public OrderResponse getById(@PathVariable int id) {
		return orderService.getById(id);
	}
	
	 
	private final String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("get")
	public void get() {
		User user = restTemplate.getForObject(apiUrl, User.class);
		System.out.println("address"+user.getAddress());
	}

	
	
	
	
}
