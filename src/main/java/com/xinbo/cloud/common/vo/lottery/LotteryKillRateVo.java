package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种杀率表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryKillRateVo implements Serializable {
    /**
     * 主键
     */
    private long id;
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 杀率
     */
    private float killRate;
    /**
     * 是否开启随机开奖
     */
    private boolean isRandomLottery;
    /**
     * 随机开奖期数
     */
    private int randomNumberPeriods;
    /**
     * 是否添加奖金池
     */
    private boolean isAddBonusPool;
    /**
     * 奖金池金额
     */
    private float bonusPoolAmount;
    /**
     * 奖金池发放规则
     */
    private String bonusPoolRule;
}
