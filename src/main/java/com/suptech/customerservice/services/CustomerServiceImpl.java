package com.suptech.customerservice.services;

import com.suptech.customerservice.dto.CustomerRequestDTO;
import com.suptech.customerservice.dto.CustomerResponseDTO;
import com.suptech.customerservice.entities.Customer;
import com.suptech.customerservice.mappers.CustomerMapper;
import com.suptech.customerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {




        Customer customer = customerMapper.customerRequestDTOtoCustomer(customerRequestDTO);

        Customer savedCustomer = customerRepository.save(customer);

        CustomerResponseDTO customerResponseDTO = customerMapper.customerToCustomerResponseDTO(savedCustomer);

        return customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO getCustomer(Long id) {
        Customer customer = customerRepository.findById(id).get();
        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        Customer customer = customerMapper.customerRequestDTOtoCustomer(customerRequestDTO);
        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        return null;
    }
}
