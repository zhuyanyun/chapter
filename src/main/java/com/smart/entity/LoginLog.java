package com.smart.entity;

import lombok.Data;

import java.util.Date;

@Data
public class LoginLog {
    private Integer loginLogId;

    private Integer userId;

    private String ip;

    private Date loginDatetime;
}
