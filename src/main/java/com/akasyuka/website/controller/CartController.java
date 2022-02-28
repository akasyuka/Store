package com.akasyuka.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CartController {

    private final List<String> goods = new ArrayList<>();

    @GetMapping("/cart")
    public List<String> getGoods() {

        return goods;
    }
    @GetMapping("/cart/add/{goodName}")
    public boolean addGood(@PathVariable(value = "goodName") String goodName) {
        goods.add(goodName);
        return true;
    }
//    @GetMapping("/cart/delete/{goodName}")
//    public boolean deleteGood()
//
//    Оплатить корзину


//1. Добавить методы удалить, оплатить
//2. Сделать рестфул: PutMapping, DeleteMapping
//3. Реализовать таблицу в которую я буду сохранять товары   entity, repositoy
//4. Список товаров(пользователь должен видеть) которые есть и только их мы можем добавлять(спросить в другой таблице)
//     !
//

}
