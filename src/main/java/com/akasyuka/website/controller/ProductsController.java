package com.akasyuka.website.controller;

import com.akasyuka.website.entity.Goods;
import com.akasyuka.website.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ProductsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/")
    public String products (Model model) {
        model.addAttribute("title", "Главная ");
        Iterable<Goods> allGoods = goodsRepository.findAll();
        model.addAttribute("goods", allGoods);
        return "products";
    }

    @GetMapping("/products/{id}")
    public String productId (@PathVariable(value = "id") long id, Model model) {
        Optional<Goods> goods = goodsRepository.findById(id);
        ArrayList<Goods> res = new ArrayList<>();
        goods.ifPresent(res::add);
        model.addAttribute("goods", res);
        return "productsId";
    }

    @GetMapping("/products/{id}/edit")
    public String productIdEdit (@PathVariable(value = "id") long id, Model model) {
        Optional<Goods> goods = goodsRepository.findById(id);
        ArrayList<Goods> res = new ArrayList<>();
        goods.ifPresent(res::add);
        model.addAttribute("goods", res);
        return "productsIdEdit";
    }

    @PostMapping("/products/{id}/edit")
    public String postEdit (@PathVariable(value = "id") long id, @RequestParam String place1, @RequestParam String place2, @RequestParam Float place3, Model model) {
        Goods post = goodsRepository.findById(id).orElseThrow();
        post.setName(place1);
        post.setAbout(place2);
        post.setPrice(place3);
        goodsRepository.save(post);
        return "redirect:/";
    }

    @PostMapping("/products/{id}/remove")
    public String postRemove (@PathVariable(value = "id") long id, Model model) {
        Goods post = goodsRepository.findById(id).orElseThrow();
        goodsRepository.delete(post);
        return "redirect:/";
    }


//    @PostMapping("/")
//    public String find (@RequestParam String name, Map<String, Object> model) {
//        ArrayList<Goods> names = goodsRepository.findByPrice(name);
//        model.put("names", names);
//        return "products";
//    }
//    <form th:action="'/'" method="POST" action="find">
//                <input type="text" th:value="${el.name} name="find">
//                <button type="submit">Найти</button>
//            </form>
//            <div th:each="el : ${prices}">
//                <h3 th:text="${el.name}"/>
//                <p th:text="${el.about}"/>
//            </div>


}