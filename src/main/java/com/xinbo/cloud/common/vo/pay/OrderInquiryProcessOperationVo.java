package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/17 17:33
 * @desc file desc
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInquiryProcessOperationVo {

    private int id;

    /**
     * 是否签名
     */
    private int RequestIsSign;

    /**
     * 签名类型
     */
    private String RequestSignType;

    /**
     * 签名参数拼接类型
     */
    private String RequestSignJoinType;

    /**
     * 签名所需参数
     */
    private String RequestSign;

    /**
     * 是否需要加密
     */
    private int RequestIsEncrypt;

    /**
     * 加密类型
     */
    private String RequestEncryptType;

    /**
     * 加密参数拼接类型
     */
    private String RequestEncryptJoinType;

    /**
     * 加密所需参数
     */
    private String RequestEncrypt;

    /**
     * 请求方式
     */
    private String AskType;

    /**
     * 请求参数拼接类型
     */
    private String RequestJoinType;

    /**
     * 请求参数
     */
    private String SendParamer;

    /**
     * 请求响应参数
     */
    private String ResponseParamer;

    /**
     * 支付id
     */
    private int PayId;

    /**
     * 支付通道id
     */
    private String ChannelId;

    /**
     * 请求地址
     */
    private String RequestUrl;
}
