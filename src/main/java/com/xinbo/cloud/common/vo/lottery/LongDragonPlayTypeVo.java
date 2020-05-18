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
public class LongDragonPlayTypeVo implements Serializable {
    /**
     * 主键
     */
    private long id;

    /**
     * 彩种类型编号
     */
    private int categoryCode;

    /**
     * 球选项(球下标以及总和,冠亚和)
     */
    private int ballOption;

    /**
     * 开大玩法
     */
    private int bigPlayId;

    /**
     * 开小玩法
     */
    private int smallPlayId;

    /**
     * 开单玩法
     */
    private int singlePlayId;
    /**
     * 开双玩法
     */
    private int doublePlayId;
    /**
     * 别名
     */
    private String otherName;

    /**
     * 枚举名
     */
    private String enumsName;
}
