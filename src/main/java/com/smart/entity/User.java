package com.smart.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userId;

    private String userName;

    private Integer credits;

    private String password;

    private Date lastVisit;

    private String lastIp;

}
