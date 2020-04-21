package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/16 14:09
 * @desc 支付管理查询VO
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaySearchVo {

    private String payName;

    private String payCode;

    private int isOpen;

    private String query;

}
