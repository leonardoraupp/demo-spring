package com.course.demo_spring.config;

import com.course.demo_spring.entities.User;
import com.course.demo_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "leonardo@gmail.com", "Leonado", "5196242039", "123");
        User user2 = new User(null, "anaa@gmail.com", "Ana", "5120245039", "321");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
