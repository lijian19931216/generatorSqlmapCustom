package com.luying.dao;

import com.luying.pojo.TCtTouch;
import com.luying.pojo.TCtTouchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCtTouchMapper {
    /**
     *
     * @mbggenerated 2018-10-31
     */
    int countByExample(TCtTouchExample example);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int deleteByExample(TCtTouchExample example);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int deleteByPrimaryKey(Long touchId);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int insert(TCtTouch record);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int insertSelective(TCtTouch record);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    List<TCtTouch> selectByExample(TCtTouchExample example);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    TCtTouch selectByPrimaryKey(Long touchId);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int updateByExampleSelective(@Param("record") TCtTouch record, @Param("example") TCtTouchExample example);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int updateByExample(@Param("record") TCtTouch record, @Param("example") TCtTouchExample example);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int updateByPrimaryKeySelective(TCtTouch record);

    /**
     *
     * @mbggenerated 2018-10-31
     */
    int updateByPrimaryKey(TCtTouch record);
}