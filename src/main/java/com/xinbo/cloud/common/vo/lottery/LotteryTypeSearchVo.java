package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种管理表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryTypeSearchVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 彩种类型ID
     */
    private Long categoryId;
    /**
     * 彩种编码
     */
    private int code;
    /**
     * 名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 是否启用
     */
    private boolean enable;
    /**
     * 是否私彩
     */
    private boolean isSystem;

    /**
     * 已开通玩法模式
     */
    private int openMode;
    /**
     * 默认玩法
     */
    private int defaultMode;
    /**
     * 是否可预设
     */
    private boolean isPreset;
    /**
     * 排序号
     */
    private int sort;
    /**
     * 简介
     */
    private String remark;
    /**
     * 期号位数
     */
    private int numberCount;
    /**
     * 期数
     */
    private int issueCount;
    /**
     * 最大值
     */
    private int maxNum;
    /**
     * 最小值
     */
    private int minNum;
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
     * 是否允许开奖重复号码
     */
    private boolean isRepeatNumber;
    /**
     * 开奖算法类型
     */
    private int issueAlgorithmType;
    /**
     * 期号销售时间类型  1.按年月日 2.年 3.累加
     */
    private int issueSalesTime;
    /**
     * 开奖球数
     */
    private int ballNumber;
    /**
     * 销售开始时间
     */
    private Date selectBallItem;
    /**
     * 销售结束时间
     */
    private Date salesEndTime;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 彩票皮肤类型
     */
    private int lotteryStyleType;
    /**
     * 最大限制球数
     */
    private int maxBallNumber;
    /**
     * 期号尾号长度
     */
    private int tailNumberLength;
    /**
     * 起始期号
     */
    private Long startIssue;

}
