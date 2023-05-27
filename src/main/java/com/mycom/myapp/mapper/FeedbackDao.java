package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.CustomerCar;
import com.mycom.myapp.pojo.Feedback;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FeedbackDao {
    int insert(Feedback feedback);
    int update(Feedback feedback);
    int delete(Feedback feedback);
    List<Feedback> select(Feedback feedback);
}
