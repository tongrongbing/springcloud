package com.home.springcloud.repository;

import com.home.springcloud.bean.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:38
 * @description：
 */
public interface OrderDetailRepository  extends JpaRepository<OrderDetail,String> {
}
