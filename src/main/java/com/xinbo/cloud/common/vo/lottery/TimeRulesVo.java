package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/5/10 15:31
 * @desc 彩种时间规则
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeRulesVo implements Serializable {
    /**
     * 序号
     */
    private int number ;

    /**
     * 开始时间
     */
    private String starTime ;

    /**
     * 结束时间
     */
    private String endTime ;

    /**
     * 时间间隔
     */
    private int timeInterval ;
}
