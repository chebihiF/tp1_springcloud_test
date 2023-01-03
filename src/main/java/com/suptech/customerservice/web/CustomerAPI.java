package com.suptech.customerservice.web;

import com.suptech.customerservice.dto.CustomerRequestDTO;
import com.suptech.customerservice.dto.CustomerResponseDTO;
import com.suptech.customerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CustomerAPI {
    private final CustomerService customerService;

    public CustomerAPI(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/customers")
    public List<CustomerResponseDTO> customers(){
        return customerService.listCustomers();
    }

    @PostMapping(path = "/customers")
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO){
        return customerService.save(customerRequestDTO);
    }

    @GetMapping(path = "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }


}
