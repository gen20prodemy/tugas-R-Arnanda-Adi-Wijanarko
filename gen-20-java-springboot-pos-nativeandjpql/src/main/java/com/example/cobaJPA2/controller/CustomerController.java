package com.example.cobaJPA2.controller;

import com.example.cobaJPA2.dto.CustomerRequest;
import com.example.cobaJPA2.entity.Customer;

import com.example.cobaJPA2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/jpql")
    public List<CustomerRequest> findCustomersByCustomerNameJPQL(@RequestParam String name) {
        return customerService.findCustomersByCustomerNameJPQL(name);
    }

    @GetMapping("/native")
    public List<CustomerRequest> findCustomersByCustomerNameNative(@RequestParam String name, Integer phoneNumber) {
        return customerService.findCustomersByCustomerNameNative(name, phoneNumber);
    }

    @PostMapping("/jpql/insert")
    public void insertCustomerJPQL(@RequestBody CustomerRequest customerRequest) {
        customerService.insertCustomerJPQL(customerRequest.getCustomerName(), customerRequest.getPhoneNumber());
    }

    @PostMapping("/native/insert")
    public void insertCustomerNative(@RequestBody CustomerRequest customerRequest) {
        customerService.insertCustomerNative(customerRequest.getCustomerName(), customerRequest.getPhoneNumber());
    }
}
