package com.home.springcloud.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 23:24
 * @description：
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;



}