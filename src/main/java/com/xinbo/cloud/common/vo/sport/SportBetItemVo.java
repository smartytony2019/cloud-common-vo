package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/3/16 16:10
 * @desc 投注详情VO
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportBetItemVo {


    /**
     * 游戏id
     */
    private int gid;


    /**
     * 联盟
     */
    private String league;


    /**
     * 投注类型
     */
    private String betType;


    /**
     * 玩法类型
     */
    private String playType;


    /**
     * 赔率
     */
    private float odds;


    /**
     * 投注附加信息
     */
    private String info;


    /**
     * 球方(H:主队,C:客队)
     */
    private String team;
}
