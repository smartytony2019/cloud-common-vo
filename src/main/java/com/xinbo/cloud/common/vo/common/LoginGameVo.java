package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/16 12:04
 * @desc 游戏登录 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginGameVo {

    /**
     * 前缀
     */
    public String alias;

    /**
     * 金额
     */
    public int money;

    /**
     * 游戏类型
     */
    public int gameType;

    /**
     * 时间戳
     */
    public String timestamp;

    /**
     * 签名sign=md5(timestamp+alias+username+money+key)
     */
    public String sign;

    /**
     * 商户号
     */
    public String appid;

    /**
     * 用户登录名
     */
    public String username;

    /**
     * 密码（密文）
     */
    public String password;

    /**
     * 是否返回手机端地址. 1,是;0,否(默认)
     */
    public String isMobileUrl;

    /**
     * 从游戏中退出时返回的地址，请使用UrlEncode进行编码示例: http%3a%2f%2fwww.bg567.com%2f
     */
    public String returnUrl;
}
