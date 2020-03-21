package com.xinbo.cloud.common.vo.common;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author 汉斯
 * @date 2020/3/11 9:50
 * @desc 游戏地址配置VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameAddressVo {
    /**
     * id主键
     */
    private Long gameId;
    /**
     * 游戏名称
     */
    @NotEmpty(message = "游戏名称不能为空")
    private String gameName;

    /**
     * 游戏链接
     */
    @NotEmpty(message = "游戏链接不能为空")
    private String gameUrl;
    /**
     * 是否启用
     */
    private boolean gameEnable;
    /**
     * 开始时间
     */
    private Date gameStartTime;
    /**
     * 结束时间
     */
    private Date gameEndTime;

    /**
     * 游戏类型
     */
    private int gameType;

    /**
     * 客户端类型(1.PC 2.H5)
     */
    private int clientType;
}
