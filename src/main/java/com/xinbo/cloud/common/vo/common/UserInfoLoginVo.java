package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/3/26 11:15
 * @desc 会员登录Login
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoLoginVo {
    private String token;
}
