package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/5/11 17:54
 * @desc 长龙设置表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LongDragonPlayTypeSearchVo implements Serializable {

    /**
     * 彩种类型编号
     */
    private int categoryCode;
}
