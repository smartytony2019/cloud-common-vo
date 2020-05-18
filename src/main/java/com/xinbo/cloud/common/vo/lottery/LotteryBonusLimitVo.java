package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 中奖限额配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryBonusLimitVo implements Serializable {
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
     * 最大中奖金额
     */
    private float maxBonusLimit;
    /**
     * 状态
     */
    private int status;
}
