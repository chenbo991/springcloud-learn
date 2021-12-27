package com.xiangxue.jack.service;

import com.xiangxue.jack.bean.ZgGoods;
import com.xiangxue.jack.dao.CommonMapper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

//    @Autowired
//    CommonMapper commonMapper;

    private AtomicInteger add = new AtomicInteger(0);

    @Transactional
    @Override
    public int addGoods(ZgGoods zgGoods) {
        int i = add.addAndGet(1);
        return i;
    }

    @Transactional(readOnly = true)
    @Override
    public List<ZgGoods> queryAll() {
        ZgGoods zgGoods = new ZgGoods();
        zgGoods.setCount(12);
        zgGoods.setGoodCode("fda44");
        zgGoods.setGoodName("chenbo商品");

        return Arrays.asList(zgGoods);
    }
}
