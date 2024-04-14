package com.example.security2.service;

import com.example.security2.dto.CategoryDTO;
import com.example.security2.entity.Category;
import com.example.security2.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RedisTemplate<String, CategoryDTO> redisTemplate;
    public List<CategoryDTO> getAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    private CategoryDTO convertToDTO (Category category){
        return new CategoryDTO(category.getCategoryId(), category.getCategoryName());
    }

    public CategoryDTO createCategoryRedis(CategoryDTO categoryDTO) {
        String redisKey = "category:" + categoryDTO.getCategoryId();
        redisTemplate.opsForValue().set(redisKey, categoryDTO);

        return categoryDTO;
    }
    public List<CategoryDTO> getCategoryRedis() {
        List<CategoryDTO> categories = new ArrayList<>();

        // Ambil semua kunci Redis untuk kategori
        Set<String> keys = redisTemplate.keys("category:*");

        // Iterasi setiap kunci dan ambil nilainya dari Redis
        for (String key : keys) {
            CategoryDTO category = redisTemplate.opsForValue().get(key);
            categories.add(category);
        }

        System.out.println("Data kategori berhasil diambil dari Redis ");

        return categories;
    }

    public CategoryDTO create(CategoryDTO categoryReq){
        Category category = new Category(categoryReq.getCategoryId(), categoryReq.getCategoryName());
        category = categoryRepository.save(category);
        return new CategoryDTO(category.getCategoryId(), category.getCategoryName());
    }
}