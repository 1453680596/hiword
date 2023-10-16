package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.Feedback;
import com.mycom.myapp.pojo.Maintain;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MaintainDao {
    int insert(Maintain maintain);
    int update(Maintain maintain);
    int delete(Maintain maintain);
    List<Maintain> select(Maintain maintain);
}
