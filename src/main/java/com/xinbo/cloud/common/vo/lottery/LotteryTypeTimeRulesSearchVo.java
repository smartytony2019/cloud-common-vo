package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种时间规则
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryTypeTimeRulesSearchVo implements Serializable {
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种时间类型(1.常规彩种2.特殊彩种)
     */
    private int timeType;
}
