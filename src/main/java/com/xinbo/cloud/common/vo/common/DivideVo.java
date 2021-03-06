package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/3/11 9:50
 * @desc 商户抽点配置VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DivideVo {

    /**
     * id主键
     */
    private Long id;
    /**
     * 商户code
     */
    private String merchantCode;
    /**
     *  公司id
     */
    private int company;
    /**
     * 抽成比例, 百分比
     */
    private double proportionate;
}
