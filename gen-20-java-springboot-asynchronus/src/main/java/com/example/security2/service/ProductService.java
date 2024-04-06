package com.example.security2.service;

import com.example.security2.dto.ProductDto;
import com.example.security2.entity.Product;
import com.example.security2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    public void updateProductStock(Product product, int newStock) {
        product.setProductStock(newStock);
        productRepository.save(product);
    }

    @Async("asyncTaskExecutor")
    public CompletableFuture<Void> updateProductStockAsync(Product product, int newStock) {
        updateProductStock(product, newStock);
        log.info("Async update product stock initiated for product ID " + product.getProductId());
        return CompletableFuture.completedFuture(null);
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
