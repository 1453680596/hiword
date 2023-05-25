package com.mycom.myapp.service;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;

import java.util.List;

public interface CustomerService {
    //Customer select(Customer customer);
    boolean insert(Customer customer);
    boolean update(Customer customer);
    boolean delete(Customer customer);
    List<Customer> select(Customer customer);
}
