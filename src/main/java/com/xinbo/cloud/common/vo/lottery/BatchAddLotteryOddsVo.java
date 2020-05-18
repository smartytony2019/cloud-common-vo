package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author 汉斯
 * @date 2020/4/28 11:14
 * @desc 批量修改彩种玩法赔率配置的VO类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchAddLotteryOddsVo implements Serializable {
    /**
     * 主键
     */
    private long id;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种玩法编号
     */
    private int playTypeCode;
    /**
     * 理论赔率（元）
     */
    private float odds;
    /**
     * 赔率阀值
     */
    private float oddsThreshold;
    /**
     * 最高赔率
     */
    private float maxOdds;
    /**
     * 最低赔率
     */
    private float minOdds;
    /**
     * 信用赔率
     */
    private float creditLimit;
    /**
     * 单注最大（元）
     */
    private float maxSingle;
    /**
     * 单注最小（元）
     */
    private float minSingle;
    /**
     * 单项最大(元)
     */
    private float maxIndividual;
    /**
     * 商户编号
     */
    private String merchantCode;

    /**
     *
     */
    private List<BatchAddLotteryOddsVo> childList;
}
