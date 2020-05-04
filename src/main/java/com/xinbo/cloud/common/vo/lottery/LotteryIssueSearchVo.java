package com.xinbo.cloud.common.vo.lottery;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩票期号
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryIssueSearchVo {
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 期号
     */
    private long issue;
    /**
     * 状态1：开盘中0：未开盘
     */
    private Integer openStatus;
    /**
     * 开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    /**
     * 结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 7: 开盘时间（openTime）  8：封盘时间（closeTime） 9：开奖时间（prizeTime）
     */
    private int dateType;


}
