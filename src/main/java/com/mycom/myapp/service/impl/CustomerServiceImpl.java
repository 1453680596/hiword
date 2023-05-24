package com.mycom.myapp.service.impl;

import com.mycom.myapp.mapper.CustomerDao;
import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer select(Customer customer) {
        return customerDao.select(customer);
    }
}
