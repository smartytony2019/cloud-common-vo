package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/27 20:10
 * @desc 代理彩种类型关系表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyLotteryCategoryRelationSearchVo implements Serializable {
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 开关   0.禁用  1.启用
     */
    private Boolean enable;
}
