package com.xinbo.cloud.common.vo.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/3/31 18:24
 * @desc 体育商户报表查询VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LotteryMerchantStatisticsSearchVo {
    /**
     * 商户号
     */
    private String merchantCode;

    /**
     * 商户名
     */
    private String merchantName;


    /**
     * 开始日期
     */
    private Date startDate;
    /**
     * 结束日期
     */
    private Date endDate;

}
