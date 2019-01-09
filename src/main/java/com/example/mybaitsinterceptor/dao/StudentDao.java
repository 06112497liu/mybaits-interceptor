package com.example.mybaitsinterceptor.dao;


import com.example.mybaitsinterceptor.entity.Student;
import com.example.mybaitsinterceptor.mybatis.Pageable;

import java.util.List;

/**
 * @author liuweibo
 * @date 2019/1/2
 */
public interface StudentDao {

    List<Student> get();

    void add(Student student);

    Object pageList(Pageable pageable);
}
