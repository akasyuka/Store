package com.akasyuka.website.controller;


import com.akasyuka.website.entity.Product;
//import com.akasyuka.website.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AddController {

//    @Autowired
//    private GoodsRepository goodsRepository;

    @GetMapping("/add")
    public String add (Model model) {
        model.addAttribute("title", "Главная ");
        return "add";
    }

//    @PostMapping("/add")
//    public String postAdd (@RequestParam String place1, @RequestParam String place2, @RequestParam Float place3, Model model) {
//        Product post = new Product(place1, place2, place3);
//        goodsRepository.save(post);
//        return "redirect:/products";
//    }
}
