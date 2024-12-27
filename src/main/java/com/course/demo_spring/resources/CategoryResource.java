package com.course.demo_spring.resources;

import com.course.demo_spring.entities.Category;
import com.course.demo_spring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
        Optional<Category> user = categoryService.findById(id);
        return ResponseEntity.ok(user);
    }
}
