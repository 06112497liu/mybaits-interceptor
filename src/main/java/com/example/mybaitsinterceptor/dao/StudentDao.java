package com.example.mybaitsinterceptor.dao;


import com.example.mybaitsinterceptor.entity.Student;
import com.example.mybaitsinterceptor.mybatis.Pageable;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author liuweibo
 * @date 2019/1/2
 */
public interface StudentDao {

    List<Student> get();

    void add(Student student);

    List<Object> pageList(@Param("pageable") Pageable pageable, int a, Map<String, Object> map, String str, Object obj);
}
