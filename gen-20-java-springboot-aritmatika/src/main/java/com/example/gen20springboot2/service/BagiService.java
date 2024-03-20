package com.example.gen20springboot2.service;

import org.springframework.stereotype.Service;

@Service
public class BagiService {
    public double division ( double a, double b){
        if(b==0){
            throw new IllegalArgumentException("Angka kedua tidak boleh bernilai 0");
        }
        return a/b;

    }
}
