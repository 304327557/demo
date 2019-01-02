package com.hao.application;

import com.hao.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    class demo{
        public void print(String str){
            System.out.println(str);
        }
    }


    private MockMvc mvc;

    @Before
    public void before(){
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testController(){
        RequestBuilder req = get("/index/test");
        mvc.perform(req).andExpect(status())
    }


    @Test
    public void contextLoads() {
        Function<String,Boolean> fun = "!!hello" :: startsWith;
        System.out.println(fun.apply("!!"));
        System.out.println("helllllllllllllllllllllllllllll");

        Consumer<String> cons = new demo() :: print; /// system.out :: print
        cons.accept("hello Consumer");

        Supplier<String> sup = "hello" :: toUpperCase;
        System.out.println(sup.get());

        Predicate<String> pre = "hello" :: equalsIgnoreCase;
        System.out.println(pre.test("hello"));
    }



}

