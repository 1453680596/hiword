package com.mycom.myapp.service;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.CustomerCar;

import java.util.List;

public interface CustomerCarService {
    boolean insert(CustomerCar customerCar);
    boolean update(CustomerCar customerCar);
    boolean delete(CustomerCar customerCar);
    List<CustomerCar> select(CustomerCar customerCar);
}
