package com.yangtaibang.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laixiaohang on 2018/11/12.
 */

public class FeedCardDetail {
    long feed_id;
    long uid;
    String nick;
    String ignature;
    String headPhoto;
    boolean isFollow;
    boolean isCollection;
    List<String> imgUrls = new ArrayList<>();
    int num_cmt;
    int num_good;
    int num_repost;
    String content;
}





//TODO
// 1.feed 发布表，带详情
// 2.feed 回复表
// 3.follow 关注关系表

// 1.查询关注关系的发布
// 2.可以回复
// 3.可以发布feed

// 1.用户详情页
