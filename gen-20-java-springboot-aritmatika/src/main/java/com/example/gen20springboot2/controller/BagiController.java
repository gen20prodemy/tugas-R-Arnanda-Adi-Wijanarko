package com.example.gen20springboot2.controller;


import com.example.gen20springboot2.model.Bagi;
import com.example.gen20springboot2.service.BagiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BagiController {

    private BagiService bagiService;

    @Autowired
    public BagiController(BagiService bagiService) {
        this.bagiService = bagiService;
    }

    @PostMapping("/bagi")
    public double pembagian(@RequestBody Bagi request) {
        return bagiService.division(request.getA(), request.getB());
    }
}