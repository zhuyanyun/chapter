package com.smart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zyy on 19/9/7.
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String helle(){
        return "欢迎光临小春论坛";
    }
}
