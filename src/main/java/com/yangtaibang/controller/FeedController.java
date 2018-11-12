package com.yangtaibang.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laixiaohang on 2018/11/12.
 */
public class FeedController {

    @RequestMapping("/fetchFeedFollowed")
    public String fetchFeedFollowed() {
        return "Hello World";
    }

    @RequestMapping("/fetchFeedRecommend")
    public String fetchFeedRecommend() {
        return "Hello World";
    }

    @RequestMapping("/publishFeed")
    public String publishFeed() {
        //unionID
        //content
        //TODO 第二期再搞图片
        //pics



        return "Hello World";
    }

    @RequestMapping("/delFeed")
    public String delFeed() {
        return "Hello World";
    }




}
