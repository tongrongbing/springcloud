package com.home.springcloud.repository;

import com.home.springcloud.bean.OrderMaster;
import com.home.springcloud.enums.OrderStatusEnum;
import com.home.springcloud.enums.PayStatusEnum;
import org.aspectj.weaver.ast.Or;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:39
 * @description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository masterRepository;

    @Test
    public void saveOrderMaster(){
        OrderMaster order = new OrderMaster();
        order.setOrderId("123456");
        order.setBuyerName("张三");
        order.setBuyerAddress("北京");
        order.setBuyerPhone("123456");
        order.setBuyerOpenid("edsdsdwq8952");
        order.setOrderAmount(new BigDecimal(13333));
        order.setOrderStatus(OrderStatusEnum.NEW.getCode());
        order.setPayStatus(PayStatusEnum.FINISHED.getCode());
        OrderMaster orderMaster = masterRepository.save(order);
        Assert.assertTrue(order != null);
    }
}

















