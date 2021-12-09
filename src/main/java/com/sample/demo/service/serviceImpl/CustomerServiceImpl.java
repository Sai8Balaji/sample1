package com.sample.demo.service.serviceImpl;

import com.sample.demo.Dto.CustomerDetailsDto;
import com.sample.demo.service.CustomerService;
import com.sample.demo.service.Dao.CustomerDao;
import com.sample.demo.service.Mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void saveCusDetails(CustomerDetailsDto customerDetailsDto) {
        customerDao.saveCusDetails(customerMapper.mapCustomerDtoToEntity(customerDetailsDto));
    }
}
