package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author 汉斯
 * @date 2020/4/28 11:11
 * @desc 彩种类型玩法配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryPlayTypeCategorySearchVo implements Serializable {
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种玩法模式
     */
    private int playMode;
    /**
     * 是否启用
     */
    private Boolean enable;
}
