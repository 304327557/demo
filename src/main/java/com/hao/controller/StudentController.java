package com.hao.controller;

import com.hao.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("p","hellllllllllllllllllllllll");
        Student s = new Student();
        s.setId(100001);
        s.setName("哈哈哈哈");
        model.addAttribute("stu", s);

        return "show.ftl";
    }
}
