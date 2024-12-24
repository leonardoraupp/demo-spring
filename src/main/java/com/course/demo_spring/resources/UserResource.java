package com.course.demo_spring.resources;

import com.course.demo_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "leo@gmail.com", "Leo", "51995153560", "123");
        return ResponseEntity.ok(user);
    }
}