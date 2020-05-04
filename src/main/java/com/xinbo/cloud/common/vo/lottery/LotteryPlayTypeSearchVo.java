package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/28 11:15
 * @desc 彩种玩法配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryPlayTypeSearchVo {
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种玩法
     */
    private String playName;
    /**
     * 玩法编码
     */
    private int code;
    /**
     * 父级编码
     */
    private int superCode;
    /**
     * 层级
     */
    private int level;
    /**
     * 是否启用
     */
    private Boolean enable;
    /**
     * 玩法类型(1.信用玩法 2.官方玩法 3) 对应枚举 LotteryPlayModeEnum
     */
    private int playMode;
    /**
     * 彩种类型玩法编号
     */
    private int playTypeCategoryCode;
    /**
     * 是否有下级
     */
    private Boolean isHasChildren;
    /**
     * 是否是菜单栏
     */
    private Boolean display;
}
