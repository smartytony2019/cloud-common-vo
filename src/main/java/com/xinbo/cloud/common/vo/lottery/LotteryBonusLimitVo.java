package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 中奖限额配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryBonusLimitVo {
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
     * 最大中奖金额
     */
    private float maxBonusLimit;
    /**
     * 状态
     */
    private int status;
}
