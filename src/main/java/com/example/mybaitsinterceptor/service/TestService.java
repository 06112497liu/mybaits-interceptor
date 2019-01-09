package com.example.mybaitsinterceptor.service;

import com.example.mybaitsinterceptor.dao.StudentDao;
import com.example.mybaitsinterceptor.mybatis.Pageable;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuweibo
 * @date 2019/1/9
 */
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestService {

    @Autowired
    StudentDao studentDao;

    public Object pageStudents() {
        return this.studentDao.pageList(new Pageable());
    }
}
