package com.home.springcloud.service.impl;

import com.home.springcloud.bean.OrderMaster;
import com.home.springcloud.dto.OrderDTO;
import com.home.springcloud.enums.OrderStatusEnum;
import com.home.springcloud.enums.PayStatusEnum;
import com.home.springcloud.repository.OrderDetailRepository;
import com.home.springcloud.repository.OrderMasterRepository;
import com.home.springcloud.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 23:09
 * @description：
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMasterRepository masterRepository;

    @Autowired
    private OrderDetailRepository detailRepository;


    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        //1.查询商品信息
        //2.计算总价
        //3.扣库存
        //4.订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMaster.setPayStatus(PayStatusEnum.UNFINISHED.getCode());
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setOrderAmount(new BigDecimal(10));
        masterRepository.save(orderMaster);
        return orderDTO;
    }
}