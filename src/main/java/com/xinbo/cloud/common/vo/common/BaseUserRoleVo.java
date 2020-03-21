package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/21 9:53
 * @desc 后台用户角色 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseUserRoleVo {

    /**
     * 用户id
     */
    private long userId;

    /**
     * 角色id
     */
    private long roleId;

    /**
     * 商户id
     */
    private int merchantId;

}
