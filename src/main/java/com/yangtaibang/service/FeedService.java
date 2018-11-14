package com.yangtaibang.service;

import com.yangtaibang.domain.yangtaibang.feed.FeedDetail;
import com.yangtaibang.domain.yangtaibang.feed.FeedDetailExample;
import com.yangtaibang.domain.yangtaibang.feed.FeedDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by laixiaohang on 2018/11/14.
 */


@Service
public class FeedService {

    @Autowired
    FeedDetailMapper feedDetailMapper;

    public void publishFeed(String unionID, String content, String pics){

        FeedDetail feedDetail = new FeedDetail();
        feedDetail.setUnionid("fwefwe");
        feedDetail.setRetid(1l);
        feedDetail.setIp("127.0.0.1");
        feedDetail.setDateline(11);
        feedDetail.setMobiModel("111");
        feedDetail.setState(1);
        feedDetail.setExts("aa");
        feedDetail.setContent("sss");
        feedDetail.setImgs("");
        System.out.println("feedDetail:"+ feedDetail);

        feedDetailMapper.insert(feedDetail);

    }

    public List<FeedDetail> fetchFeedRecommend(String unionID){
        FeedDetailExample feedDetailExample = new FeedDetailExample();
        List<FeedDetail> list = feedDetailMapper.selectByExample(feedDetailExample);

        return list;
    }
}