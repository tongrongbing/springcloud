package com.home.springcloud.repository;

import com.home.springcloud.bean.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:53
 * @description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository detailRepository;

    @Test
    public void saveOrderDetail(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12356626");
        orderDetail.setProductId("12345633");
        orderDetail.setOrderId("123456");
        orderDetail.setProductNum(100);
        orderDetail.setProductName("西红柿");
        orderDetail.setProductIcon("D://deve");
        orderDetail.setProductPrice(new BigDecimal(150));
        OrderDetail data = detailRepository.save(orderDetail);
        Assert.assertTrue(data != null);
    }

}