package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/30 15:25
 * @desc 代理平台各彩种开启状态实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentLotteryTypeSearchVo {
    /**
     * 代理商户编号
     */
    private String merchantCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种名称
     */
    private String lotteryTypeName;

    /**
     * 排序号
     */
    private Boolean enable;
    /**
     * 已开通玩法模式
     */
    private Integer openMode;
    /**
     * 是否热门彩种
     */
    private Boolean isHot ;

}
