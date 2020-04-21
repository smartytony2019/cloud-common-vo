package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/17 17:58
 * @desc file desc
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentNeedOperationVo {

    private int id;

    /**
     * 返回业务参数
     */
    private String BusinessParameter;

    /**
     * 金额单位
     */
    private String AmountType;

    /**
     * 密钥拼接方式
     */
    private String KeyJoinType;

    /**
     * 填充参数
     */
    private String Filling;

    /**
     * 请求头
     */
    private String ContentType;

    /**
     * 成功状态码对应json
     */
    private String ServiceStatusCodes;

    /**
     * 回调成功响应参数
     */
    private String SuccessfullyReturns;

    /**
     * 支付id
     */
    private int PayId;

    /**
     * 通道id
     */
    private String ChannelId;

    /**
     * 通道编码配置json
     */
    private String ChannelCoding;

    /**
     * 回调类型
     */
    private int CallBackType;

    /**
     * 参数名是否参与签名
     */
    private int KeyIsSign;

    /**
     * 签名时参数拼接字符
     */
    private String JoinStr;

}
