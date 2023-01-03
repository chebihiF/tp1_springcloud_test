package com.suptech.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CustomerRequestDTO {
    private Long id ;
    private String name ;
    private String email ;
}
