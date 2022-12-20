package com.suptech.customerservice.mappers;

import com.suptech.customerservice.dto.CustomerRequestDTO;
import com.suptech.customerservice.dto.CustomerResponseDTO;
import com.suptech.customerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOtoCustomer(CustomerRequestDTO customerRequestDTO);
}
