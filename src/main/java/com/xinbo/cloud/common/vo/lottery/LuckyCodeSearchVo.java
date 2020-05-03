package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author 汉斯
 * @date 2020/5/1 17:02
 * @desc 开奖记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LuckyCodeSearchVo {

    /**
     * 期号
     */
    private long sn;

    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 时间
     */
    private int timeType;
    /**
     * 开奖时间
     */
    private List<Date> times;
    /**
     * 商户号
     */
    private String merchantCode;
}
