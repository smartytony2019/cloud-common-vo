package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 小富
 * @date 2020/4/20 14:35
 * @desc file desc
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutPayOperationVo {

    public int id;

    /**
     * 支付id
     */
    public int PayId;
    /**
     * 支付类型
     */
    public String types;

    /**
     * 编辑流程
     */
    public List<String> Processs;

    /**
     * 下单配置
     */
    public OutPayPlaceOrderOperationVo PlaceOrder;

    /**
     * 订单查询配置
     */
    public OutPayOrderInquiryOperationVo OrderInquiry;

    /**
     * 回调配置
     */
    public OutPayOrderCallbackOperationVo OrderCallBack;

    /**
     * 必须参数配置
     */
    public OutPaymentNeedOperationVo PaymentNeed;
}
