package com.example.security2.controller;

import com.example.security2.dto.CategoryDTO;
import com.example.security2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/redis")
    public List<CategoryDTO> getAllCategoriesFromRedis() {
        return categoryService.getCategoryRedis();
    }

    @PostMapping("/redis")
    public CategoryDTO addCategoryToRedis(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.createCategoryRedis(categoryDTO);
    }
}
