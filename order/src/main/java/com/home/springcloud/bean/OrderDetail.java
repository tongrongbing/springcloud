package com.home.springcloud.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:27
 * @description：
 */
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productNum;

    private String productIcon;

    private Date createTime;

    private Date updateTime;



}