package com.home.springcloud.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 16:50
 * @description：
 */
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDesc;

    private String productIcon;

    private Integer categoryType;

    private Integer productStatus;

    private Date createTime;

    private Date updateTime;


}