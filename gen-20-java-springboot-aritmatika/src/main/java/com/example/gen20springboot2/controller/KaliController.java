package com.example.gen20springboot2.controller;

import com.example.gen20springboot2.model.Kali;
import com.example.gen20springboot2.service.KaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KaliController {

    private KaliService kaliService;

    @Autowired
    public KaliController(KaliService kaliService) {
        this.kaliService = kaliService;
    }

    @PostMapping("/kali")
    public int perkalian(@RequestBody Kali request) {
        return kaliService.multiply(request.getA(), request.getB());
    }
}
