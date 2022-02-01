package com.akasyuka.website.controllers;

import com.akasyuka.website.models.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/order")
    public String order (Model model) {
        return "order";
    }

}