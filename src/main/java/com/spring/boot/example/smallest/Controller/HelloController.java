package com.spring.boot.example.smallest.Controller;


import com.spring.boot.example.smallest.Entity.User;
import com.spring.boot.example.smallest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired UserRepository userRepository;

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

   /* @RequestMapping("/user/{u_id}")
    public User getUser(@PathVariable("u_id") Integer u_id){
        return userRepository.findOne();
    }*/
}
