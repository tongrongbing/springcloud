package com.home.springcloud.service;

import com.home.springcloud.dto.OrderDTO;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 23:04
 * @description：
 */
public interface OrderService {

    public OrderDTO createOrder(OrderDTO orderDTO);
}
