package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.CustomerCar;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerCarDao {
    int insert(CustomerCar customerCar);
    int update(CustomerCar customerCar);
    int delete(CustomerCar customerCar);
    List<CustomerCar> select(CustomerCar customerCar);
}
