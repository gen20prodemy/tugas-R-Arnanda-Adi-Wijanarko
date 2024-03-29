package com.example.MVCLatihan.controller;

import com.example.MVCLatihan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String produkBarang(Model model){
        model.addAttribute("products", productService.findAll());
        return "index";
    }
}
