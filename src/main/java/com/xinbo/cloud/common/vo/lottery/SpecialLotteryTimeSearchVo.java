package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/27 19:35
 * @desc 特殊彩种销售时间
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecialLotteryTimeSearchVo implements Serializable {
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
}
