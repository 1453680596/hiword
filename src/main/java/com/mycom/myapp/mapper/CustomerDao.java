package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {
//    Customer select(Customer customer);
    int insert(Customer customer);
    int update(Customer customer);
    int delete(Customer customer);
    List<Customer> select(Customer customer);
}
