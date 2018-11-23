package com.yangtaibang.controller;

import com.yangtaibang.domain.yangtaibang.feed.FeedDetail;
import com.yangtaibang.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by laixiaohang on 2018/11/12.
 */

@RestController
public class FeedController {
    @Autowired
    FeedService feedService;

    @RequestMapping("/fetchFeedFollowed")
    public List<FeedDetail> FetchFeedFollowed(String unionID) {
        List<FeedDetail> list = feedService.fetchFeedRecommend(unionID);

        return list;
    }

    //TODO 返回数据库里面最新的feed
    @RequestMapping("/fetchFeedRecommend")
    public String FetchFeedRecommend() {
        return "Hello World";
    }

    @RequestMapping("/publishFeed")
    public String PublishFeed(String unionID, String content, String pics) {

        feedService.publishFeed(unionID, content, pics);

        return "published ok";
    }

    @RequestMapping("/delFeed")
    public String DelFeed() {
        return "Hello World";
    }




}
