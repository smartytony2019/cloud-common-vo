package com.xinbo.cloud.common.vo.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/3/16 12:04
 * @desc 用户帐变查询 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyMoneyFlowSearchVo {
    /**
     * 帐变类型
     */
    private Integer item;
    /**
     * 商户订单号
     */
    private String merchantSerial;

    /**
     * 帐变开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operationStartTime;
    /**
     * 帐变结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operationEndTime;
}
