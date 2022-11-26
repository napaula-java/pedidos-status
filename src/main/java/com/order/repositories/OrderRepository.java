package com.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.order.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
