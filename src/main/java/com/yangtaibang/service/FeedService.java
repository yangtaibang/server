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
        feedDetail.setUnionid(unionID);
        feedDetail.setRetid(1l);
        feedDetail.setIp("127.0.0.1");
        feedDetail.setDateline(11);
        feedDetail.setMobiModel("111");
        feedDetail.setState(1);
        feedDetail.setExts("aa");
        feedDetail.setContent(content);
        feedDetail.setImgs("https://imgsa.baidu.com/forum/wh%3D200%2C90%3B/sign=181a58913787e9504242fb6e20087f7a/c8b3913533fa828b0804cab1f01f4134960a5ace.jpg");
        System.out.println("feedDetail:"+ feedDetail);

        feedDetailMapper.insert(feedDetail);

    }

    public List<FeedDetail> fetchFeedRecommend(String unionID){
        FeedDetailExample feedDetailExample = new FeedDetailExample();
        List<FeedDetail> list = feedDetailMapper.selectByExample(feedDetailExample);

        return list;
    }
}