package com.longe.service;

import com.longe.dao.GoodsMapper;
import com.longe.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> getGoods(){

        return goodsMapper.getGoods();
    }
}