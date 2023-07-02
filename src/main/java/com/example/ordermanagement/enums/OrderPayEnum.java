package com.example.ordermanagement.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum OrderPayEnum {
    WX(1, "微信支付"),
    ZFB(2, "支付宝"),
    ZZ(3, "银行转账");


    @EnumValue
    private final Integer code;

    private final String value;

    OrderPayEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    private OrderPayEnum getOrderExpress(Integer code) {
        for (OrderPayEnum instance : OrderPayEnum.values()) {
            if (instance.getCode().equals(code)) {
                return instance;
            }
        }
        return null;
    }


}
