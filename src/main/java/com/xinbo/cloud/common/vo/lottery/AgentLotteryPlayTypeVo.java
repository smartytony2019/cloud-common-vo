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
public class AgentLotteryPlayTypeVo {
    /**
     * 主键
     */
    private long id;
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
     * 彩种玩法编号
     */
    private int playTypeCode;
    /**
     * 彩种玩法名称
     */
    private String playTypeName;
    /**
     * 彩种玩法编号
     */
    private int playMode;

    /**
     * 排序号
     */
    private int sort;
    /**
     * 排序号
     */
    private boolean enable;

}
