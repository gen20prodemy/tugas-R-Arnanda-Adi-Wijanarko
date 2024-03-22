package com.example.cobaJPA2.service;

import com.example.cobaJPA2.dto.CustomerRequest;
import com.example.cobaJPA2.entity.Customer;
import com.example.cobaJPA2.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
@Autowired
private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerRequest> findCustomersByCustomerNameJPQL(String name) {
        List<Customer> customers = customerRepository.findCustomersByCustomerNameJPQL(name);
        return customers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<CustomerRequest> findCustomersByCustomerNameNative(String name, Integer phoneNumber) {
        List<Customer> customers = customerRepository.findCustomersByCustomerNameNative(name, phoneNumber);
        return customers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public void insertCustomerJPQL(String name, Integer phoneNumber) {
        customerRepository.insertCustomerJPQL(name, phoneNumber);
    }

    public void insertCustomerNative(String name, Integer phoneNumber) {
        customerRepository.insertCustomerNative(name, phoneNumber);
    }

    private CustomerRequest convertToDto(Customer customer) {
        return new CustomerRequest(customer.getCustomerId(), customer.getCustomerName(), customer.getPhoneNumber());
    }

}
