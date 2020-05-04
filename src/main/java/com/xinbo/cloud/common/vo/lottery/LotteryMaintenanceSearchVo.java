package com.xinbo.cloud.common.vo.lottery;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/28 11:14
 * @desc 彩种维护记录表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryMaintenanceSearchVo {
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 类型 1公休2维护
     */
    private int maintainType;
}
