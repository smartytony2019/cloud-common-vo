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
    @Min(value = 0, message = "转入金额不能小于0")
    public float amount;

    public String getMerchantSerial() {
        return merchantSerial;
    }

    public float getAmount() {
        return amount;
    }

    public void setMerchantSerial(String merchantSerial) {
        this.merchantSerial = merchantSerial;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
