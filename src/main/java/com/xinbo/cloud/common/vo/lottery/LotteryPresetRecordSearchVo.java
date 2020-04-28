package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种预设记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryPresetRecordSearchVo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 彩种id
     */
    private Long lotteryTypeId;
    /**
     * 彩种编码
     */
    private int lotteryTypeCode;
    /**
     * 期号
     */
    private Long issueNumber;
    /**
     * 预设号码集合
     */
    private String presetNumberItem;
    /**
     * 销售开始时间
     */
    private Date startTime;
    /**
     * 销售结束时间
     */
    private Date endTime;
    /**
     * 封盘时间
     */
    private Date sealTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 创建人id
     */
    private Long createUserId;
    /**
     * 预设结果号码
     */
    private int presetResultNumber;
    /**
     * 开奖结果
     */
    private String lotteryResult;
    /**
     * 开奖时间
     */
    private Date luckyTime;
    /**
     * 预设记录所属时间
     */
    private Date recordTime;
}
