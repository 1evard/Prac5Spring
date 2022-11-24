package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/Home")
    public String index (){
        return "Home";
    }
    @GetMapping("/info")
    public String index1 (@RequestParam(name = "a", required = false, defaultValue = "Принт") String a,
                          Model model){
        System.out.println(a);
        model.addAttribute("temp",a);
        return "Menu";
    }
}

