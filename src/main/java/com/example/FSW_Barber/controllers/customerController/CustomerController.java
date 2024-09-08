package com.example.FSW_Barber.controllers.customerController;

import com.example.FSW_Barber.domain.customer.Customer;
import com.example.FSW_Barber.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer createUser(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
