package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 汉斯
 * @date 2020/4/13 13:33
 * @desc 后台用户修改密码 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseUsersUpdatePwdVo {

    /**
     * 用户id
     */
    private long userId;
    /**
     * 用户密码
     */
    private String password;
}
