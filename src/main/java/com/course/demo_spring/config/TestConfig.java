package com.course.demo_spring.config;

import com.course.demo_spring.entities.Order;
import com.course.demo_spring.entities.User;
import com.course.demo_spring.repositories.OrderRepository;
import com.course.demo_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "leonardo@gmail.com", "Leonardo", "5196242039", "123");
        User user2 = new User(null, "ana@gmail.com", "Ana", "5120245039", "321");

        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2024-12-26T17:30:22Z"), user1); // ISO 8601 pattern
        Order order2 = new Order(null, Instant.parse("2024-12-22T09:10:34Z"), user2);
        Order order3 = new Order(null, Instant.parse("2024-12-26T17:31:30Z"), user1);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}