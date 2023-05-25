package com.mycom.myapp.service;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;

public interface CustomerService {
    Customer select(Customer customer);
    boolean insert(Customer customer);
    boolean update(Customer customer);
    Customer delete(Customer customer);
}
