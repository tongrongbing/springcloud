package com.home.springcloud.VO;

import lombok.Data;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 20:20
 * @description：请求返回对象
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}