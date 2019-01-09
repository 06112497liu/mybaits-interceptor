package com.example.mybaitsinterceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example")
public class MybaitsInterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybaitsInterceptorApplication.class, args);
	}

}

