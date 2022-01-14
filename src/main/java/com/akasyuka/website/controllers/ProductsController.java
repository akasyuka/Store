package com.akasyuka.website.controllers;

import com.akasyuka.website.models.Goods;
import com.akasyuka.website.repo.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/products")
    public String products (Model model) {
        model.addAttribute("title", "Главная ");
        Iterable<Goods> allGoods = goodsRepository.findAll();
        model.addAttribute("goods", allGoods);
        return "products";
    }

    @GetMapping("/add")
    public String add (Model model) {
        model.addAttribute("title", "Главная ");
        return "add";
    }

    @PostMapping("/add")
    public String postAdd (@RequestParam String place1, @RequestParam String place2, @RequestParam Float place3, Model model) {
        Goods post = new Goods(place1, place2, place3);
        goodsRepository.save(post);
        return "redirect:/products";
    }

}