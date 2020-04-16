package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/3/11 9:50
 * @desc 游戏地址配置查询VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameAddressSearchVo {
    /**
     * 游戏名称
     */
    private String gameName;

    /**
     * 是否启用
     */
    private Boolean gameEnable;
    /**
     * 游戏类型
     */
    private Integer gameType;

    /**
     * 客户端类型(1.PC 2.H5)
     */
    private Integer clientType;
}
