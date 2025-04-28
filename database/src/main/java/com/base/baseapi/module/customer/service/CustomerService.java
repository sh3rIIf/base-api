package com.base.baseapi.module.customer.service;

import com.base.baseapi.module.customer.data.Customer;
import com.base.baseapi.module.customer.data.CustomerDto;
import com.base.baseapi.module.customer.data.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDto addCustomer(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setTelNumber(dto.getTelNumber());

        customerRepository.save(customer);

        dto.setId(customer.getId());

        return dto;
    }

    public CustomerDto getCustomer(CustomerDto dto) {
        Customer customer = customerRepository.findById(dto.getId()).orElseThrow(IllegalArgumentException::new);

        dto.setName(customer.getName());
        dto.setTelNumber(customer.getTelNumber());

        return dto;
    }
}
