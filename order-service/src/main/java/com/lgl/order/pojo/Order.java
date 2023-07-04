package com.lgl.order.pojo;

import lombok.Data;

@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private com.lgl.order.pojo.User user;
}