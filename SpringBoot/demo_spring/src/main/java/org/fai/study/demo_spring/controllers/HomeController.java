package org.fai.study.demo_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home/")
public class HomeController {
    @GetMapping("index")
    public String Index(){
        return "home/index";
    }
}
