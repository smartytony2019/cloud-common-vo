package com.xinbo.cloud.common.vo.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 马仔
 * @date 2020/3/16 12:04
 * @desc 用户帐变 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMoneyFlowSearchVo {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 帐变类型
     */
    private int item;

    /**
     * 商户订单号
     */
    private String merchantSerial;

    /**
     * 数据节点
     */
    private int dataNode;

    /**
     * 商户号
     */
    private String merchantCode;

    /**
     * 帐变时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operationTime;
}
