package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:15
 * @desc 代理玩法配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentLotteryPlayTypeSearchVo {
    /**
     * 代理商户编号
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
     * 彩种模式
     */
    private Integer playMode;
    /**
     * 彩种玩法名称
     */
    private String playTypeName;
    /**
     * 排序号
     */
    private Boolean enable;

}
