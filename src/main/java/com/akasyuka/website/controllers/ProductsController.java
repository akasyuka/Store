package com.akasyuka.website.controllers;

import com.akasyuka.website.models.Goods;
import com.akasyuka.website.repo.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}