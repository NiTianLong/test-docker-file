package com.longe.controller;

import com.longe.entity.Goods;
import com.longe.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("goods")
    public List<Goods> getGoods(){

        return goodsService.getGoods();
    }
}