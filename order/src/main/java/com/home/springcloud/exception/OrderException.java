package com.home.springcloud.exception;

import com.home.springcloud.enums.ResultEnum;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 23:34
 * @description：
 */
public class OrderException extends RuntimeException{
    private Integer code;
    public OrderException(Integer code,String msg){
        super(msg);
    }
    public OrderException (ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}