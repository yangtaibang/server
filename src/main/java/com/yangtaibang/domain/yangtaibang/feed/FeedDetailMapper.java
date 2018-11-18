package com.yangtaibang.domain.yangtaibang.feed;

import com.yangtaibang.domain.yangtaibang.feed.FeedDetail;
import com.yangtaibang.domain.yangtaibang.feed.FeedDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int countByExample(FeedDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int deleteByExample(FeedDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int insert(FeedDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int insertSelective(FeedDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    List<FeedDetail> selectByExample(FeedDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    FeedDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") FeedDetail record, @Param("example") FeedDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int updateByExample(@Param("record") FeedDetail record, @Param("example") FeedDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int updateByPrimaryKeySelective(FeedDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_detail
     *
     * @mbggenerated Sun Nov 18 11:22:32 CST 2018
     */
    int updateByPrimaryKey(FeedDetail record);
}