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
public class AgentLotteryTypeVo implements Serializable {
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
     * 彩种名称
     */
    private String lotteryTypeName;
    /**
     * 排序号
     */
    private int sort;
    /**
     * 排序号
     */
    private boolean enable;
    /**
     * 已开通玩法模式
     */
    private int openMode;
    /**
     * 默认玩法
     */
    private int defaultMode;

    /**
     * 中奖限额
     */
    private int winningLimit ;

    /**
     * 信用球数限制
     */
    private int xBallLimit ;

    /**
     * 官方球数限制
     */
    private int gBallLimit ;

    /**
     * 最大球数
     */
    private int maxBallNumber ;

    /**
     * 是否热门彩种
     */
    private boolean isHot ;

    /**
     * 热门彩种排序
     */
    private int hotSort ;
}
