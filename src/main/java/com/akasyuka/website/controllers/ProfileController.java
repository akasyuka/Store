package com.akasyuka.website.controllers;


import com.akasyuka.website.models.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String order (Model model) {
        return "profile";
    }
}
