package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 小富
 * @date 2020/3/16 16:09
 * @desc 投注VO
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportBetSubmitVo {

    /**
     * 可赢金额
     */
    private float canWinMoney;


    /**
     * 投注金额
     */
    private float betMoney;

    /**
     * 玩法id
     */
    private int playId;


    /**
     * 自动接受赔率
     */
    private boolean autoAcceptOdds;

    /**
     * 注单项
     */
    private List<SportBetItemVo> betItems;

}
