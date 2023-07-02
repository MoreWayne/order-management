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
public class ClientDO {

    @TableId(value = "client_id", type = IdType.AUTO)
    private Integer id;

    @TableField("client_name")
    private String clientName;

    @TableField("client_phone")
    private String clientPhone;

    @TableField("client_address")
    private String clientAddress;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
