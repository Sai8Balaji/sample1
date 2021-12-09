package com.sample.demo.service.Dao;

import com.sample.demo.Entity.Customer;
import com.sample.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDao {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCusDetails(Customer customer) {
        customerRepository.save(customer);
    }
}
