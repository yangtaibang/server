package com.yangtaibang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by laixiaohang on 2018/11/12.
 */

@RestController
public class Ping {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World !";
    }
}
