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
public class LotteryPlayTypeVo {
    /**
     * 主键
     */
    private long id;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种名称
     */
    private String lotteryTypeName;
    /**
     * 彩种玩法ID
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
     * 父级id
     */
    private long pid;
    /**
     * 层级
     */
    private int level;
    /**
     * 排序编号
     */
    private int sort;
    /**
     * 是否启用
     */
    private boolean enable;
    /**
     * 玩法类型(1.信用玩法 2.官方玩法 3) 对应枚举 LotteryPlayModeEnum
     */
    private int playMode;
    /**
     * 彩种类型玩法编号
     */
    private int categoryPlayTypeCode;
    /**
     * 彩种类型玩法名称
     */
    private String categoryPlayTypeName;
    /**
     * 范例
     */
    private String example;
    /**
     * 中奖说明
     */
    private String luckyInfo;
    /**
     * 应用算法id
     */
    private long algorithmId;
    /**
     * 是否有下级
     */
    private boolean isHasChildren;
    /**
     * 是否是菜单栏
     */
    private boolean display;
    /**
     * 注数验证格式
     */
    private String verifyFormat;
}
