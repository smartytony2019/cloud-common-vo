package com.xinbo.cloud.common.vo.lottery;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
public class LotteryPresetRecordVo implements Serializable {
    /**
     * 预设记录ID
     */
    private long id ;

    /**
     * 商户号
     */
    private String merchantCode ;

    /**
     * 彩种code
     */
    private int lotteryTypeCode ;

    /**
     * 期号
     */
    private long issueNumber ;
    /**
     * 预设号码集合
     */
    private String presetNumberItem ;

    /**
     * 彩种类型供选集合
     */
    private String selectBallItem ;

    /**
     * 销售开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime ;

    /**
     * 销售结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime ;

    /**
     * 封盘时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sealTime ;

    /**
     * 预设结果号码
     */
    private int presetResultNumber ;

    /**
     * 封盘时间
     */
    private int advanceSecond ;

    /**
     * 开奖结果是否允许重复号码
     */
    private boolean isRepeatNumber ;
    /**
     * 开奖球数
     */
    private int ballNumber ;
    /**
     * 预设记录所属时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recordTime ;

    /**
     * 开奖结果
     */
    private String lotteryResult ;
    /**
     * 开奖时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date luckyTime ;
}
