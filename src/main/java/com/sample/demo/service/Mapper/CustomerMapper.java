package com.sample.demo.service.Mapper;

import com.sample.demo.Dto.CustomerDetailsDto;
import com.sample.demo.Entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer mapCustomerDtoToEntity(CustomerDetailsDto customerDetailsDto) {
        Customer customer = new Customer();
        customer.setId(customerDetailsDto.getId());
        customer.setCusName(customerDetailsDto.getCusName());
        customer.setAddress(customerDetailsDto.getAddress());
        customer.setPhNum(customerDetailsDto.getPhNum());
        return customer;
    }
}
