package com.xinbo.cloud.common.vo.merchanta.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author 汉斯
 * @date 2020/3/11 9:50
 * @desc 商户对外接口通用VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlatformApiRequestVo {
    /**
     * 签名
     */
    @NotEmpty(message = "签名不能为空")
    private String sign ;
    /**
     *  日期时间戳
     */
    @NotEmpty(message = "日期时间戳不能为空")
    private String time ;
    /**
     * 会员帐号
     */
    private String username ;
    /**
     * 运营平台渠道
     */
    @NotEmpty(message = "平台渠道号不能为空")
    private String channel ;
    /**
     * 游戏ID
     */
    private String gameId ;
}
