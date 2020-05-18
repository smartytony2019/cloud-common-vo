package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种杀率查询VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryKillRateSearchVo implements Serializable {
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
     * 是否开启随机开奖
     */
    private Boolean isRandomLottery;

    /**
     * 是否添加奖金池
     */
    private Boolean isAddBonusPool;
}
