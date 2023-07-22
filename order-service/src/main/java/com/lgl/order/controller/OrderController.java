package com.lgl.order.controller;

import com.lgl.order.pojo.Order;
import com.lgl.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 1、根据id查询订单
        Order order = orderService.queryOrderById(orderId);
        /*// 2、远程查询user
        // 2.1远程地址
        String url = "http://userservice/user/" + order.getUserId();
        // 2.2发起调用
        User user = restTemplate.getForObject(url, User.class);
        // 3.存入order
        order.setUser(user);*/
        // 4.返回
        return order;
    }
}
