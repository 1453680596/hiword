package com.mycom.myapp.service.impl;

import com.mycom.myapp.mapper.CustomerCarDao;
import com.mycom.myapp.mapper.CustomerDao;
import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.CustomerCar;
import com.mycom.myapp.service.CustomerCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerCarServiceImpl implements CustomerCarService {
    @Autowired
    private CustomerCarDao customerCarDao;


    @Override
    public boolean insert(CustomerCar customerCar) {
        int i = customerCarDao.insert(customerCar);
        return i>0;
    }

    @Override
    public boolean update(CustomerCar customerCar){
        int i = customerCarDao.update(customerCar);
        return i>0;
    }

    @Override
    public boolean delete(CustomerCar customerCar){
        int i = customerCarDao.delete(customerCar);
        return i>0;
    }

    @Override
    public List<CustomerCar> select(CustomerCar customerCar){
        return customerCarDao.select(customerCar);
    }
}
