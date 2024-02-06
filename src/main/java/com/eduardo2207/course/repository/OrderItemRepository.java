package com.eduardo2207.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo2207.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
