package com.xinbo.cloud.common.vo.merchanta.api;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author 汉斯
 * @date 2020/3/16 18:16
 * @desc 余额转入转出请求实体
 */
public class TranslateRequestVo extends PlatformApiRequestVo {
    /**
     * 代理平台订单号
     */
    @NotEmpty(message = "订单号不能为空")
    public String merchantSerial;

    /**
     * 转入金额 >0 保留2位小数
     */
    public String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMerchantSerial() {
        return merchantSerial;
    }

    public void setMerchantSerial(String merchantSerial) {
        this.merchantSerial = merchantSerial;
    }
}
