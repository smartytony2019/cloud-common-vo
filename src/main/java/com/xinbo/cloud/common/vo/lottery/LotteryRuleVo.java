package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种玩法规则
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryRuleVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 玩法类型(1:官方,2:信用)
     */
    private int playModel;
    /**
     * 彩种类型, 彩种(1:彩种类型, 2:彩种)
     */
    private int categoryLottery;
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     *  彩种code
     */
    private int lotteryTypeCode;
    /**
     * 规则内容
     */
    private String ruleContent;
    /**
     * 是否启用
     */
    private boolean enable;
    /**
     * 是否启用
     */
    private int sort;
}
