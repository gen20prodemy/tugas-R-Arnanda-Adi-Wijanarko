package com.example.security2.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.example.security2.dto.ProductDto;

@Component
public class ProductProducer {

    @Autowired
    private KafkaTemplate<String, ProductDto> kafkaTemplate;

    private static final String TOPIC = "product-topic"; // Ganti dengan nama topik yang sesuai

    public void sendProduct(ProductDto productDto) {
        kafkaTemplate.send(TOPIC, productDto.getProductId().toString(), productDto);
    }
}
