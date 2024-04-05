package com.example.security2.controller;

import com.example.security2.dto.ProductDto;
import com.example.security2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/send-product")
    public String sendProductToKafka(@RequestBody ProductDto productDto) {
        productService.sendProductToKafka(productDto);
        return "Product sent to Kafka successfully";
        }
}
