package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/28 11:15
 * @desc 彩种玩法关联配置
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryPlayTypeAssociationVo implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种类型名称
     */
    private String categoryName;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种类型玩法名称
     */
    private String categoryPlayTypeName;
    /**
     * 彩种类型玩法编号
     */
    private int categoryPlayTypeCode;
    /**
     * 彩种类型玩法模式
     */
    private int categoryPlayTypeMode;
    /**
     * 是否启用
     */
    private boolean enable;
}
