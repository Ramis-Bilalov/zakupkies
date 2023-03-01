package com.example.zakupkies.service;

import com.example.zakupkies.model.CustomerDTO;

public interface CustomerService {

    void addCustomer(int id, String name);
    CustomerDTO getCustomer(int id);
}

