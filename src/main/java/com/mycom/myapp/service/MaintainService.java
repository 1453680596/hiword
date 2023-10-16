package com.mycom.myapp.service;

import com.mycom.myapp.pojo.Feedback;
import com.mycom.myapp.pojo.Maintain;

import java.util.List;

public interface MaintainService {
    boolean insert(Maintain maintain);
    boolean update(Maintain maintain);
    boolean delete(Maintain maintain);
    List<Maintain> select(Maintain maintain);
}
