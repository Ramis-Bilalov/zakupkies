package com.example.zakupkies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@AllArgsConstructor
public class CustomerDTO {

    private int id;
    private String name;

}