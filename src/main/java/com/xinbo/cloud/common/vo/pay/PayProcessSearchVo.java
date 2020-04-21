package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/19 13:53
 * @desc file desc
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayProcessSearchVo {

    private int id;

    /**
     * 支付编码
     */
    private String payCode;

    /**
     * 填写的秘钥的类型
     */
    private int keyType;

    /**
     * 支付名称
     */
    private String payName;

    /**
     * 流程
     */
    private int Process;

    private int page;

    private int pageSize;
}
