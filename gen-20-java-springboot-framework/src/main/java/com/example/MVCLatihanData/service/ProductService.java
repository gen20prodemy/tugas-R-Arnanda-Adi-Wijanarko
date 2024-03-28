package com.example.MVCLatihanData.service;

import com.example.MVCLatihanData.dto.ProductDto;
import com.example.MVCLatihanData.entity.Product;
import com.example.MVCLatihanData.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ProductDto convertToDTO(Product product) {
        return new ProductDto(product.getProductId(),
                   product.getProductName(),
                   product.getProductStock(),
                   product.getProductPrice(),
                   product.getCategory().getCategoryId(),
                   product.getCategory().getCategoryName());
    }
}
