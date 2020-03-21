package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/3/18 16:42
 * @desc 体育冠军注单
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportChampionBetVo {

    /**
     * 球队名
     */
    public String teamName;

    /**
     * 赔率
     */
    public double odds;
}
