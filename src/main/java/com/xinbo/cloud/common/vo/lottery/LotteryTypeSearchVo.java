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
 * @desc 彩种管理表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryTypeSearchVo {
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编码
     */
    private Integer code;
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
    private Boolean enable;
    /**
     * 是否私彩
     */
    private Boolean isSystem;

    /**
     * 已开通玩法模式
     */
    private Integer openMode;
    /**
     * 是否可预设
     */
    private Boolean isPreset;
    /**
     * 是否允许开奖重复号码
     */
    private Boolean isRepeatNumber;
    /**
     * 期号销售时间类型  1.按年月日 2.年 3.累加
     */
    private Integer issueSalesTime;
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
     * 3: 销售时间（salesStartTime）  4：开奖时间（startTime）
     */
    private int dateType;
}
