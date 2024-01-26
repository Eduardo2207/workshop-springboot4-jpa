package com.eduardo2207.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo2207.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
