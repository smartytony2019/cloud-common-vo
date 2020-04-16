package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/3/11 9:50
 * @desc 商户查询VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantSearchVo {

    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 商户状态
     */
    private Boolean status;
    /**
     * 数据节点(枚举:EnumMyCatDataNode)
     */
    private Integer dataNode;
}
