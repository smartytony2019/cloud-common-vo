package com.xinbo.cloud.common.vo.common;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author 马仔
 * @date 2020/3/23 20:11
 * @desc file desc
 */

@Data
public class LoginVo {

    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private  String username;

    /**
     * 用户密码
     */
    @NotEmpty(message = "密码不能为空")
    private  String password;

}
