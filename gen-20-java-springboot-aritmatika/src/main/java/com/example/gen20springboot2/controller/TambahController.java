package com.example.gen20springboot2.controller;

import com.example.gen20springboot2.model.Tambah;
import com.example.gen20springboot2.service.TambahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TambahController {
    private TambahService tambahService;

    @Autowired
    public TambahController (TambahService tambahService){
        this.tambahService = tambahService;
    }

    @PostMapping("/tambah")
    public int penjumlahan (@RequestBody Tambah request){
        return tambahService.addition(request.getA(), request.getB());
    }

}
