package com.example.security2.config;

import com.example.security2.dto.CategoryDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig2 {

    @Bean
    public RedisTemplate<String, CategoryDTO> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, CategoryDTO> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(CategoryDTO.class));
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
}