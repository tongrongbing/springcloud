package com.home.springcloud.repository;

import com.home.springcloud.bean.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:37
 * @description：
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
