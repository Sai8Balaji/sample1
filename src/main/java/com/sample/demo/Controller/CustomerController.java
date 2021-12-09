package com.sample.demo.Controller;

import com.sample.demo.Dto.CustomerDetailsDto;
import com.sample.demo.Entity.Customer;
import com.sample.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save-customer-details")
    public void saveCusDetails(@RequestBody CustomerDetailsDto customerDetailsDto) {
        customerService.saveCusDetails(customerDetailsDto);
    }
}
