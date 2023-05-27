package com.mycom.myapp.service;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.Feedback;

import java.util.List;

public interface FeedbackService {
    boolean insert(Feedback feedback);
    boolean update(Feedback feedback);
    boolean delete(Feedback feedback);
    List<Feedback> select(Feedback feedback);
}
