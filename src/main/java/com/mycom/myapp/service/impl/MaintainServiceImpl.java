package com.mycom.myapp.service.impl;

import com.mycom.myapp.mapper.FeedbackDao;
import com.mycom.myapp.mapper.MaintainDao;
import com.mycom.myapp.pojo.Feedback;
import com.mycom.myapp.pojo.Maintain;
import com.mycom.myapp.service.FeedbackService;
import com.mycom.myapp.service.MaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintainServiceImpl implements MaintainService {
    @Autowired
    private MaintainDao maintainDao;
    @Override
    public boolean insert(Maintain maintain) {
        int i = maintainDao.insert(maintain);
        return i>0;
    }

    @Override
    public boolean update(Maintain maintain){
        int i = maintainDao.update(maintain);
        return i>0;
    }

    @Override
    public boolean delete(Maintain maintain){
        int i = maintainDao.delete(maintain);
        return i>0;
    }

    @Override
    public List<Maintain> select(Maintain maintain){
        return maintainDao.select(maintain);
    }
}