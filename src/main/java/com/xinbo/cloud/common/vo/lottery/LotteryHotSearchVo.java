package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 热门彩种
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryHotSearchVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 是否热门彩种
     */
    private boolean isHot;
    /**
     * 排序号
     */
    private int sort;
    /**
     * 说明
     */
    private String description;
}
