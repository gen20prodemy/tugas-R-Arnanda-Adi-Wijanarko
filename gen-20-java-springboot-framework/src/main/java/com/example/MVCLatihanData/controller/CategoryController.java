package com.example.MVCLatihanData.controller;

import com.example.MVCLatihanData.dto.CategoryDto;
import com.example.MVCLatihanData.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String listCategory (Model model) {
        List<CategoryDto> categories = categoryService.getAllCategory();
        model.addAttribute("categories", categories);
        return "indexcategory";
    }
}
