package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩票期号
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryIssueSearchVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 彩种类型id
     */
    private Long categoryId;
    /**
     * 彩种id
     */
    private Long lotteryTypeId;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 期号
     */
    private Long issue;
    /**
     * 开盘时间
     */
    private Date openTime;
    /**
     * 结束时间
     */
    private Date closeTime;
    /**
     * 本期结果
     */
    private String openNum;
    /**
     * 状态1：开盘中0：未开盘
     */
    private int openStatus;
    /**
     * 开奖时间
     */
    private Date prizeTime;

}
