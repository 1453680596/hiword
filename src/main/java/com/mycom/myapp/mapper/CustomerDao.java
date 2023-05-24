package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {
    Customer select(Customer customer);
}
