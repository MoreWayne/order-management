package com.example.ordermanagement.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ordermanagement.enums.OrderExpressEnum;
import com.example.ordermanagement.enums.OrderPayEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("order")
public class OrderDO {

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @TableField("client_id")
    private Integer clientId;

    @TableField("order_price")
    private Integer orderPrice;

    @TableField("order_address")
    private String orderAddress;

    @TableField("order_comment")
    private String orderComment;

    @TableField("order_express")
    private OrderExpressEnum orderExpressEnum;

    @TableField("order_pay")
    private OrderPayEnum orderPayEnum;

    @TableField("order_date")
    private LocalDate orderDate;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
