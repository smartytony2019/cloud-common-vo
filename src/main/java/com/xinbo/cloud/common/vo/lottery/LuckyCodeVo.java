package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/5/1 17:02
 * @desc 开奖记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LuckyCodeVo implements Serializable {
    /**
     * 期号
     */
    private long sn;

    /**
     * 开奖号码
     */
    private String code;

    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
}
