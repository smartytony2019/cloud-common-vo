package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:14
 * @desc 彩种玩法赔率配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryOddsSearchVo {
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种玩法编号
     */
    private int playTypeCode;
    /**
     * 商户编号
     */
    private String merchantCode;
}
