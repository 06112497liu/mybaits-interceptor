package com.example.mybaitsinterceptor.controller;

import com.example.mybaitsinterceptor.service.TestService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuweibo
 * @date 2019/1/9
 */
@RestController
@RequestMapping("/page")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/student")
    public Object pageStudent() {
        return this.testService.pageStudents();
    }
}
