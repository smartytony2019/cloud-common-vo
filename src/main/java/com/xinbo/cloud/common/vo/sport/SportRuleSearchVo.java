package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育规则查询VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportRuleSearchVo {

    /**
     * 体育项目
     */
    public int item;

    /**
     * 规则类型
     */
    public int category;

}
