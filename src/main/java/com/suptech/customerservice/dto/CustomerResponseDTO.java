package com.suptech.customerservice.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerResponseDTO {
    private Long id ;
    private String name ;
    private String email ;
}
