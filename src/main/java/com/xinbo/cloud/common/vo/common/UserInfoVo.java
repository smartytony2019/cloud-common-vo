package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 马仔
 * @date 2020/3/16 12:04
 * @desc 用户信息 vo
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 注册IP
     */
    private String regIp;
    /**
     * 登录IP
     */
    private String loginIp;
    /**
     * 密码
     */
    private String passWord;

    /**
     * 用户类型(0:正常  2:试玩)
     */
    private int type;
    private int dataNode;

}
