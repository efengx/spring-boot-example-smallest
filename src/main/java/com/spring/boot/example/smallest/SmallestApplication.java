package com.spring.boot.example.smallest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring.boot.example.smallest"})
@EnableJpaRepositories("com.spring.boot.example.smallest.Dao")
public class SmallestApplication {
    @RequestMapping
    public static void main(String[] args) {
        SpringApplication.run(SmallestApplication.class, args);
    }
}
