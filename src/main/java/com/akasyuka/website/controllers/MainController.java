package com.akasyuka.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home (Model model) {
        model.addAttribute("title", "Главная ");
        return "home";
    }

    @GetMapping("/about")
    public String about (Model model) {
        model.addAttribute("title", "Главная ");
        return "about";
    }

    @GetMapping("/add")
    public String add (Model model) {
        model.addAttribute("title", "Главная ");
        return "add";
    }

}
