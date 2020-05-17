package com.home.springcloud.convert;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.home.springcloud.bean.OrderDetail;
import com.home.springcloud.dto.OrderDTO;
import com.home.springcloud.dto.OrderForm;
import com.home.springcloud.enums.ResultEnum;
import com.home.springcloud.exception.OrderException;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 23:39
 * @description：
 */
@Slf4j
public class OrderFormToOrderDTO {

    public static OrderDTO convert(OrderForm orderForm){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setBuyerPhone(orderForm.getPhone());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        Gson gson = new Gson();
        try{
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {}.getType());
        }catch (Exception e){
            log.error("【json转换】错误，string={}",orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }

}