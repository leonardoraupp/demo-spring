package com.course.demo_spring.config;

import com.course.demo_spring.entities.*;
import com.course.demo_spring.entities.enums.OrderStatus;
import com.course.demo_spring.repositories.*;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;


    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et quam lobortis, efficitur mauris in, interdum est.";

        Product product1 = new Product(null, "PC Gamer", description, 8000.99, "www.image.com");
        Product product2 = new Product(null, "Notebook", description, 4000.99, "www.image.com");
        Product product3 = new Product(null, "English Grammar Book", description, 359.50, "www.image.com");
        Product product4 = new Product(null, "Gamer Keyboard", description, 200.99, "www.image.com");
        Product product5 = new Product(null, "The Hobbit", description, 42.50, "www.image.com");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        product1.addCategory(category3);
        product1.addCategory(category1);
        product2.addCategory(category3);
        product2.addCategory(category1);
        product3.addCategory(category2);
        product4.addCategory(category1);
        product5.addCategory(category2);

        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        User user1 = new User(null, "leonardo@gmail.com", "Leonardo", "5196242039", "123");
        User user2 = new User(null, "ana@gmail.com", "Ana", "5120245039", "321");

        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2024-12-26T17:30:22Z"), OrderStatus.PAID, user1); // ISO 8601 pattern
        Order order2 = new Order(null, Instant.parse("2024-12-22T09:10:34Z"), OrderStatus.DELIVERED, user2);
        Order order3 = new Order(null, Instant.parse("2024-12-26T17:31:30Z"), OrderStatus.PAID, user1);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        OrderItem orderItem1 = new OrderItem(order1, product1, 1, product1.getPrice());
        OrderItem orderItem2 = new OrderItem(order2, product2, 1, product2.getPrice());
        OrderItem orderItem3 = new OrderItem(order2, product4, 1, product4.getPrice());
        OrderItem orderItem4 = new OrderItem(order3, product3, 1, product3.getPrice());
        OrderItem orderItem5 = new OrderItem(order3, product5, 1, product5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(orderItem1, orderItem2, orderItem3, orderItem4, orderItem5));

        Payment payment1 = new Payment(null, Instant.parse("2024-12-26T19:30:22Z"), order1);
        order1.setPayment(payment1);
        orderRepository.save(order1);
    }
}
