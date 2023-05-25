package com.mycom.myapp.service.impl;

import com.mycom.myapp.mapper.CustomerDao;
import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

//    @Override
//    public Customer select(Customer customer) {
//        return customerDao.select(customer);
//    }

    @Override
    public boolean insert(Customer customer) {
        int i = customerDao.insert(customer);
        return i>0;
    }

    @Override
    public boolean update(Customer customer){
        int i = customerDao.update(customer);
        return i>0;
    }

    @Override
    public boolean delete(Customer customer){
        int i = customerDao.delete(customer);
        return i>0;
    }

    @Override
    public List<Customer> select(Customer customer){
        return customerDao.select(customer);
    }


}
