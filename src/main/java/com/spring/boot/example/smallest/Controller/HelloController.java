package com.spring.boot.example.smallest.Controller;

import com.spring.boot.example.smallest.Entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")

public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
    @RequestMapping("/user")
    @ResponseBody
  public String getUser(){
        UserEntity user =new UserEntity(1,"张三",20,"武汉大学");
        return user.getId()+user.getName()+user.getAge()+user.getSchool();
    }
}
