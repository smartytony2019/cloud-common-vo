package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/5/1 17:02
 * @desc 开奖记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LuckyCodeVo {
    /**
     * 标识id
     */
    private Long id;

    /**
     * 期号
     */
    private Long sn;

    /**
     * 开奖号码
     */
    private String code;

    /**
     * 彩种编号
     */
    private int lotteryTypeCode;

    /**
     * 开奖时间
     */
    private Date actionTime;

    /**
     * 投注总额
     */
    private float betCoin;

    /**
     * 和局总额
     */
    private float heCoin;

    /**
     * 盈亏总额
     */
    private float luckyCoin;

    /**
     * 是否计算
     */
    private boolean isSettle;

    /**
     * 预留号码
     */
    private String reserveCode;
    /**
     * 当前遗漏
     */
    private String missing;

    /**
     * 商户号
     */
    private String merchantCode;
}
