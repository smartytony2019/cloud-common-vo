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
public class LuckyTimeSearchVo implements Serializable {
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
     * 开始时间
     */
    private Date startTime ;

    /**
     * 结束时间
     */
    private Date endTime ;
    /**
     * 是否统计
     */
    private Boolean isStatistics ;
}
