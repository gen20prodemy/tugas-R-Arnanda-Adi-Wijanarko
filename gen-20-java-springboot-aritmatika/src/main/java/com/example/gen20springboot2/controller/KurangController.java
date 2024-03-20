package com.example.gen20springboot2.controller;

import com.example.gen20springboot2.model.Kurang;
import com.example.gen20springboot2.service.KurangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KurangController {

    private KurangService kurangService;

    @Autowired
    public KurangController(KurangService kurangService) {
        this.kurangService = kurangService;
    }

    @PostMapping("/kurang")
    public int pengurangan(@RequestBody Kurang request) {
        return kurangService.substract(request.getA(), request.getB());
    }
}
