package com.example.MVCLatihan.service;

import com.example.MVCLatihan.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private static List<ProductEntity> productEntities = Arrays.asList(
            new ProductEntity(1L, "Sepatu", 5, 1000.0),
            new ProductEntity(2L, "Tas", 4, 2000.0),
            new ProductEntity(3L, "Pensil", 5, 3000.0),
            new ProductEntity(4L, "Pulpen", 6, 4000.0),
            new ProductEntity(5L, "Penghapus", 7, 5000.0)
    );

    public List<ProductEntity> findAll(){
        return productEntities;
    }
}
