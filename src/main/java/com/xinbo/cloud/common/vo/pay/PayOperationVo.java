package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/16 14:15
 * @desc 支付操作VO
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayOperationVo {

    private int id;

    private long uid;

    /**
     * 支付名称
     */
    private String payName;

    /**
     * 支付编码
     */
    private String payCode;

    /**
     * 支付类型
     */
    private String Types;

    /**
     * 支持功能
     */
    private int function;

    /**
     * 是否开启
     */
    private int isOpen;

    /**
     * 需要的秘钥类型
     */
    private int KeyType;

    /**
     * 排序
     */
    private int sort;
}
