package com.home.springcloud.enums;

import lombok.Getter;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/15 22:46
 * @description：
 */
@Getter
public enum PayStatusEnum {
    UNFINISHED(0,"未支付"),
    FINISHED(1,"支付成功");
    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
