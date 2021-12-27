package com.xiangxue.jack.service;

import com.xiangxue.jack.bean.ZgOrder;
import com.xiangxue.jack.dao.ZgOrderMapper;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private Logger logger = LoggerFactory.getLogger(getClass());

//    @Autowired
//    ZgOrderMapper zgOrderMapper;
    private AtomicInteger intd = new AtomicInteger(0);

    private static  final String url = "http://127.0.0.1:8080/deliver?orderId=";

    @Override
    public ZgOrder queryOrderById(String orderId) {
        ZgOrder zgOrder = new ZgOrder();
        zgOrder.setOrderId(orderId);
        zgOrder.setOrderMoney(intd.get());
        return zgOrder;
    }

    @Transactional
    @Override
    public int addOrder(ZgOrder zgOrder) {
        return intd.incrementAndGet();
    }
}
