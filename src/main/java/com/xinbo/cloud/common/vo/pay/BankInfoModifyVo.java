package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/15 14:32
 * @desc file desc
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankInfoModifyVo {

    private String _Id;

    private String bankName;

    private String bankCode;

    private boolean statue;

}
