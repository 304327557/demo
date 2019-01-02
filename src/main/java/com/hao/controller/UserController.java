package com.hao.controller;


import com.hao.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class UserController {

    @RequestMapping("/test")
    public String demoController(){
        System.out.println("hhhhhhhhhhhhh...");
        return "hello world!";
    }

    @RequestMapping("find/{id}/{name}")
    public User find(@PathVariable Integer id, @PathVariable String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

}
