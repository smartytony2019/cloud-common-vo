package com.xinbo.cloud.common.vo.merchanta.api;


import javax.validation.constraints.NotEmpty;

/**
 * @author 汉斯
 * @date 2020/3/16 18:45
 * @desc 查询订单号请求实体
 */
public class TransRecordRequestVo extends PlatformApiRequestVo {
    /**
     * 代理平台订单号
     */
    @NotEmpty(message = "订单号不能为空")
    public String merchantSerial;

    public String getMerchantSerial() {
        return merchantSerial;
    }

    public void setMerchantSerial(String merchantSerial) {
        this.merchantSerial = merchantSerial;
    }
}
