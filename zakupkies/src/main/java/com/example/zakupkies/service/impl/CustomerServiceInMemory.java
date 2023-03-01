package com.example.zakupkies.service.impl;

import com.example.zakupkies.model.CustomerDTO;
import com.example.zakupkies.service.CustomerService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceInMemory implements CustomerService {

    private Map<Integer, CustomerDTO> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id, name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
}
