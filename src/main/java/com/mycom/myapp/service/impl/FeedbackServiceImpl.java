package com.mycom.myapp.service.impl;

import com.mycom.myapp.mapper.CustomerDao;
import com.mycom.myapp.mapper.FeedbackDao;
import com.mycom.myapp.pojo.CustomerCar;
import com.mycom.myapp.pojo.Feedback;
import com.mycom.myapp.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackDao feedbackDao;
    @Override
    public boolean insert(Feedback feedback) {
        int i = feedbackDao.insert(feedback);
        return i>0;
    }

    @Override
    public boolean update(Feedback feedback){
        int i = feedbackDao.update(feedback);
        return i>0;
    }

    @Override
    public boolean delete(Feedback feedback){
        int i = feedbackDao.delete(feedback);
        return i>0;
    }

    @Override
    public List<Feedback> select(Feedback feedback){
        return feedbackDao.select(feedback);
    }
}
