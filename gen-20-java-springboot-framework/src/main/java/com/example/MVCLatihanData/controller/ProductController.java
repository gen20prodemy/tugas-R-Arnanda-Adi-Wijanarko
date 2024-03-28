package com.example.MVCLatihanData.controller;

import com.example.MVCLatihanData.dto.ProductDto;
import com.example.MVCLatihanData.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String listProducts(Model model) {
        List<ProductDto> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "indexproduct";
    }
}
