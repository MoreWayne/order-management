package com.example.ordermanagement.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum OrderExpressEnum {
    SF(1, "顺丰"),
    DB(2, "德邦"),
    YJ(3, "宇佳");

    @EnumValue
    private final Integer code;

    private final String value;

    OrderExpressEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    private OrderExpressEnum getOrderExpress(Integer code) {
        for (OrderExpressEnum instance : OrderExpressEnum.values()) {
            if (instance.getCode().equals(code)) {
                return instance;
            }
        }
        return null;
    }

}
