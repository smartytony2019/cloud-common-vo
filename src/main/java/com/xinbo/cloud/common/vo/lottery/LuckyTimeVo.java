package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/5/1 16:57
 * @desc 开奖时间
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LuckyTimeVo implements Serializable {
    /**
     *
     */
    private int id;
    /**
     * 序号
     */
    private int no ;

    /**
     * 期号
     */
    private long sn ;

    /**
     * 彩种编号
     */
    private int lotteryTypeCode ;

    /**
     * 封盘时间(提前多少票)
     */
    private int advanceSecond ;

    /**
     * 开始时间
     */
    private Date startTime ;

    /**
     * 结束时间
     */
    private Date endTime ;
    /**
     * 运行时间
     */
    private Date addTime ;
    /**
     * 日期
     */
    private String day ;
    /**
     * 是否统计
     */
    private boolean isStatistics ;
}
