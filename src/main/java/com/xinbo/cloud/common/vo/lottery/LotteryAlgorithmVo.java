package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩票彩种算法
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryAlgorithmVo implements Serializable {
    /**
     * 主键
     */
    private long id;
    /**
     * 玩法名称
     */
    private int code;
    /**
     * 玩法名称
     */
    private String name;
    /**
     * 起始位置
     */
    private int startIndex;
    /**
     * 所需个数
     */
    private int needCount;
    /**
     * 比对数（，号分隔）
     */
    private String validateCount;
    /**
     * 算法名称
     */
    private String format;
}
