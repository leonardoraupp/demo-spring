package com.course.demo_spring.repositories;

import com.course.demo_spring.entities.OrderItem;
import com.course.demo_spring.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}