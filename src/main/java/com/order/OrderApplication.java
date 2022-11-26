package com.order;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.order.entities.Order;
import com.order.enums.OrderStatus;
import com.order.repositories.OrderRepository;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		Order o1 = new Order(Instant.parse("2020-12-20T21:04:00Z"), OrderStatus.PAID);
		Order o2 = new Order(Instant.parse("2021-01-23T22:05:07Z"), OrderStatus.WAITING_PAYMENT); 
		Order o3 = new Order(Instant.parse("2021-01-24T12:15:07Z"), OrderStatus.WAITING_PAYMENT);
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
