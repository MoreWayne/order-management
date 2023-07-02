package com.example.ordermanagement.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("client")
public class ItemDO {

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer itemId;

    @TableField("order_id")
    private Integer orderId;

    @TableField("client_id")
    private Integer clientId;

    @TableField("item_name")
    private String itemName;

    @TableField("item_piece")
    private Integer itemPiece;

    @TableField("item_set")
    private Integer itemSet;

    @TableField("item_price")
    private Integer itemPrice;

    @TableField("item_comment")
    private String itemComment;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
