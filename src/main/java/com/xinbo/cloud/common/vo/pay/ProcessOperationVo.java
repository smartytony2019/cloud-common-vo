package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 小富
 * @date 2020/4/17 17:20
 * @desc file desc
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class    ProcessOperationVo {

    private int id;

    private int payId;

    private String types;

    /**
     * 编辑流程
     */
    private List<String> process;

    /**
     * 下单配置
     */
    private PlaceOrderProcessOperationVo orderProcessOperationVo;

    /**
     * 订单查询配置
     */
    private OrderInquiryProcessOperationVo orderInquiryProcessOperationVo;

    /**
     * 回调配置
     */
    private OrderCallbackProcessOperationVo callbackProcessOperationVo;

    /**
     * 必须参数配置
     */
    private PaymentNeedOperationVo paymentNeedOperationVo;
}
