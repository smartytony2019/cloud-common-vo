package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种玩法规则
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryRuleSearchVo implements Serializable {
    /**
     * 玩法类型(1:官方,2:信用)
     */
    private int playMode;
    /**
     * 彩种类型, 彩种(1:彩种类型, 2:彩种)
     */
    private int categoryLottery;
    /**
     * 关联键(彩种类型code, 彩种code)
     */
    private int relatedKey;
    /**
     * 是否启用
     */
    private Boolean enable;
}
