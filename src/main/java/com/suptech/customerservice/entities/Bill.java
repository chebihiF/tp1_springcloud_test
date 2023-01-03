package com.suptech.customerservice.entities;

import java.time.LocalDate;

public class Bill {
    private String code;
    private LocalDate date;
    private double amount ;
    private Long customerID;
    private Customer customer;
}
