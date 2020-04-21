package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/15 14:23
 * @desc 银行卡信息查询VO
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankInfoSearchVo {

    private long id;

    private String bankName;

    private String bankCode;

    private int status;

}
