package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种时间规则
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryTypeTimeRulesSearchVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种时间类型(1.常规彩种2.特殊彩种)
     */
    private int timeType;
    /**
     * 封盘时间(提前多少秒)
     */
    private int advanceSecond;
    /**
     * 时间规则
     */
    private String timeRules;
    /**
     * 提前开封盘时间
     */
    private int openSealTime;
    /**
     * 预计开奖时间
     */
    private int expectedDrawTime;
    /**
     * 拉取开奖结果频率
     */
    private int pullDrawFrequency;
    /**
     * 最大开奖时长
     */
    private int maxLotteryDuration;
}
