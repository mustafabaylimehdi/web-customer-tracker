package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    @Transactional
    public Customer getCustomer(int theId);

    @Transactional
    public void deleteCustomer(int theId);

    @Transactional
    public List<Customer> searchCustomers(String theSearchName);
}
