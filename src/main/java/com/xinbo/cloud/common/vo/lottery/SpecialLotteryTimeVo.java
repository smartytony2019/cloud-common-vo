package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class SpecialLotteryTimeVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种名称
     */
    private String lotteryTypeName;
    /**
     * 期号
     */
    private Long issue;
    /**
     * 销售开始时间
     */
    private Date startTime;
    /**
     * 销售结束时间
     */
    private Date endTime;
    /**
     * 开奖时间
     */
    private Date openTime;

}
