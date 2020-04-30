package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/27 20:08
 * @desc 彩种类型配置实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryCategoryVo {
    /**
     * 主键
     */
    private long id;
    /**
     * 彩种类型名称
     */
    private String name;
    /**
     * 彩种类型编号
     */
    private int code;
    /**
     * 彩种类型英文名称
     */
    private String enName;
    /**
     * 排序编号
     */
    private int sort;
    /**
     * 是否启用
     */
    private boolean enable;
    /**
     * 简介
     */
    private String info;
    /**
     * 默认玩法  1:信用玩法 2:官方玩法 3:信用玩法及官方玩法
     */
    private int playMode;
    /**
     * H5图标
     */
    private String h5Icon;
    /**
     * PC大图标
     */
    private String bigIcon;
    /**
     * PC小图标
     */
    private String smallIcon;
    /**
     * 起始数字
     */
    private int startNum;
    /**
     * 终止数字
     */
    private int lastNum;
    /**
     * 是否重复开奖号码 1.重复  0.不重复
     */
    private int isRepeatNumber;
    /**
     * 供选球集合
     */
    private String selectBallItem;
    /**
     * 最大球数
     */
    private int maxBallNumber;
    /**
     * 是否开启长龙
     */
    private boolean longDragonEnable;
    /**
     * 是否开启追号
     */
    private boolean chasingNumEnable;

    /**
     * 开奖球数
     */
    private int ballNumber;

}
