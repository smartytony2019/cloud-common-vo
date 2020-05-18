package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/30 15:25
 * @desc 代理平台各彩种开启状态实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentLotteryTypeSearchVo implements Serializable {
    /**
     * 代理商户编号
     */
    private String merchantCode;

    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种名称
     */
    private String lotteryTypeName;
    /**
     * 排序号
     */
    private Boolean enable;
    /**
     * 是否热门彩种
     */
    private Boolean isHot ;

}
