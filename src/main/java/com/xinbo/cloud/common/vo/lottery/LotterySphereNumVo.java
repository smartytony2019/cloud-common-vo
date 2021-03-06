package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种玩法球数限制
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotterySphereNumVo implements Serializable {
    /**
     * 主键
     */
    private long id;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种名称
     */
    private String lotteryTypeName;
    /**
     * 彩种玩法编号
     */
    private int playTypeCode;
    /**
     * 彩种玩法名称
     */
    private String playTypeName;
    /**
     * 最大球数
     */
    private int maxSphereNum;
    /**
     * 限制球数
     */
    private int limitSphereNum;
}
