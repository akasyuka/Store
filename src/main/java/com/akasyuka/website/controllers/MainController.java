package com.akasyuka.website.controllers;

import com.akasyuka.website.models.Goods;
import com.akasyuka.website.repo.GoodsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
