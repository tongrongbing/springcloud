package com.home.springcloud.enums;

import lombok.Getter;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:43
 * @description：
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完成订单"),
    CANCELD(2,"取消订单");

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}