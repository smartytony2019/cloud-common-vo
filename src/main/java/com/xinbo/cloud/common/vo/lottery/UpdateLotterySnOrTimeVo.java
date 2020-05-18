package com.xinbo.cloud.common.vo.lottery;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/5/11 16:19
 * @desc 彩种当期期号或销售时间修改VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLotterySnOrTimeVo {
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 期号
     */
    private long sn;
    /**
     *
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
}
