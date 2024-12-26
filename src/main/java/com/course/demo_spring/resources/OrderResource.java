package com.course.demo_spring.resources;

import com.course.demo_spring.entities.Order;
import com.course.demo_spring.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = orderService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Optional<Order>> findById(@PathVariable Long id) {
        Optional<Order> order = orderService.findById(id);
        return ResponseEntity.ok(order);
    }
}
