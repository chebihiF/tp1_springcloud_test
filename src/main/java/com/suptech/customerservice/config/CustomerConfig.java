package com.suptech.customerservice.config;

import com.suptech.customerservice.dto.CustomerRequestDTO;
import com.suptech.customerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    private final CustomerService customerService;

    public CustomerConfig(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Bean
    CommandLineRunner init_customer(){
        return args -> {
            customerService.save(new CustomerRequestDTO(null,"mohamed","mohamed@gmail.com"));
            customerService.save(new CustomerRequestDTO(null,"sanaa","sanaa@gmail.com"));
            customerService.save(new CustomerRequestDTO(null,"ali","ali@gmail.com"));
            customerService.listCustomers().forEach(System.out::println);
        };
    }
}
