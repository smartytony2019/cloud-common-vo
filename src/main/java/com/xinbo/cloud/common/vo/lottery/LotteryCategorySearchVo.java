package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 汉斯
 * @date 2020/4/27 20:08
 * @desc 彩种类型配置实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryCategorySearchVo {
    /**
     * 彩种类型名称
     */
    private String name;
    /**
     * 彩种类型英文名称
     */
    private String enName;
    /**
     * 是否启用
     */
    private Boolean enable;
    /**
     * 默认玩法  1:信用玩法 2:官方玩法 3:信用玩法及官方玩法
     */
    private Integer playType;

    /**
     * 是否重复开奖号码 1.重复  0.不重复
     */
    private Boolean isRepeatNumber;

    /**
     * 是否开启长龙
     */
    private Boolean longDragonEnable;
    /**
     * 是否开启追号
     */
    private Boolean chasingNumEnable;

}
