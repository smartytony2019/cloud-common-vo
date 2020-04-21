package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/20 14:32
 * @desc file desc
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OutPayOrderCallbackOperationVo {

    private int id;

    /**
     * 收到的参数列表
     */
    private String ResponseParamer;

    /**
     * 是否需要解密
     */
    private int ResponseIsDecode;

    /**
     * 解密类型
     */
    private String ResponseDecodeType;

    /**
     * 解密后参数拼接类型
     */
    private String ResponseDecodeJoinType;

    /**
     * 解密后参数
     */
    private String ResponseDecode;

    /**
     * 验签方式
     */
    private String ResponseSignType;

    /**
     * 验签参数拼接方式
     */
    private String ResponseSignJoinType;

    /**
     * 验签参数
     */
    private String ResponseSign;

    /**
     * 是否需要验证订单状态
     */
    private int IsJudgeOrderStatus;

    /**
     * 支付id
     */
    private int PayId;

}
