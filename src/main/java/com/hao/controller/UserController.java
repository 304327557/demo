package com.hao.controller;


import com.hao.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Value(value = "${hao.secret}")
    private String value;


    @RequestMapping("/test")
    public String demoController(){
        System.out.println("hhhhhhhhhhhhh...");
        LOG.info("log4j-----------------------");
        return "hello world!";
    }

    @RequestMapping("find/{id}/{name}")
    public User find(@PathVariable Integer id, @PathVariable String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @RequestMapping("get")
    public Map<String, Object> get(@RequestParam String name){
        Map<String,Object> map = new HashMap<>();
        map.put("name", name);
        map.put("value",value);
        return map;
    }

}
