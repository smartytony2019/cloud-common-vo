package com.xinbo.cloud.common.vo.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/18 16:41
 * @desc file desc
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserInfoMoneyVo {

    /**
     * 账变用户名
     */
    private String userName;

    /**
     * 操作金额
     */
    private float money;

    /**
     * 账变类型
     */
    private int moneyChangeEnum;

    /**
     * 商户订单号
     */
    private String merchantSerial;

    /**
     * 商户号
     */
    private String merchantCode;

    /**
     * 数据库节点
     */
    private int dataNode;
}
