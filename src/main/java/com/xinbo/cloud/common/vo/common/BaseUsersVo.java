package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 汉斯
 * @date 2020/4/13 13:33
 * @desc 后台用户 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseUsersVo {

    /**
     * 用户id
     */
    private long userId;
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 是否绑定IP
     */
    private int isBand;

    /**
     * 绑定IP
     */
    private String bandIp;

    /**
     * 秘钥
     */
    private String secretKey;

    /**
     * 邮箱
     */
    private String emails;

    /**
     * 限制IP
     */
    private String limitIp;

    /**
     * 冻结标识 0 启用 1冻结
     */
    private boolean nullity;

    /**
     * 安全吗
     */
    private String securityCode;

    /**
     * 管理员类型
     */
    private int adminType;

    /**
     * 是否锁定
     */
    private int isLock;

    /**
     * 用户唯一身份
     */
    private String userIdentity;
}
