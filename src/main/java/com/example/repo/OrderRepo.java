package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
