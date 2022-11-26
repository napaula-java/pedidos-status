package com.order.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entities.Order;
import com.order.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

		@Autowired
		private OrderRepository orderRepository;
		
		
		@GetMapping
		public ResponseEntity<List<Order>> findAll() {
			List<Order> list = orderRepository.findAll();
			return ResponseEntity.ok().body(list);
		}
	}

