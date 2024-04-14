package com.example.security2.controller;


import com.example.security2.dto.CategoryDTO;
import com.example.security2.utils.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {
    @Autowired
    private MessageProducer messageProducer;


    @PostMapping
    public String sendMessage(@RequestParam("message") String message){
        messageProducer.sendMessage("test", message);
        return "Message sent: " +message;
    }


}