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
 * @desc 彩种预设记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryPresetRecordSearchVo {
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 彩种类型编码
     */
    private int categoryCode;
    /**
     * 彩种编码
     */
    private int lotteryTypeCode;

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


}
