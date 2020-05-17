package com.home.springcloud.controller;

import com.home.springcloud.VO.ResultVO;
import com.home.springcloud.convert.OrderFormToOrderDTO;
import com.home.springcloud.dto.OrderDTO;
import com.home.springcloud.dto.OrderForm;
import com.home.springcloud.enums.ResultEnum;
import com.home.springcloud.exception.OrderException;
import com.home.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 23:03
 * @description：
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确,orderForm={}",orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderFormToOrderDTO.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【购物车】为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        OrderDTO result = orderService.createOrder(orderDTO);
        Map<String,String> data = new HashMap<>();
        data.put("orderId",result.getOrderId());
        ResultVO resultVO = new ResultVO(0,"成功",data);
        return resultVO;
    }

}