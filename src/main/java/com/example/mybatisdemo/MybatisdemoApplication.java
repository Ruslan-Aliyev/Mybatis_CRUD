package com.example.mybatisdemo;

import com.example.mybatisdemo.models.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MappedTypes(User.class)
@MapperScan("com.example.mybatisdemo.mappers")
@SpringBootApplication
public class MybatisdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MybatisdemoApplication.class, args);
	}

}
