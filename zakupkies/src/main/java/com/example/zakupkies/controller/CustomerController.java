package com.example.zakupkies.controller;

import com.example.zakupkies.model.CustomerDTO;
import com.example.zakupkies.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @PostMapping(value = "/add")
    public void addCustomer(@RequestParam int id, @RequestParam String name) {
        customerService.addCustomer(id, name);
    }

    @GetMapping(value = "/get")
    public CustomerDTO getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }
}
