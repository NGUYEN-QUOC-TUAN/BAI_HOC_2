package com.example.bai_hoc_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/index")
    public String viewHome(Model model) {
        return "home/index";
    }

    @GetMapping("/about")
    public String viewAbout(Model model) {
        return "home/about";
    }
}
