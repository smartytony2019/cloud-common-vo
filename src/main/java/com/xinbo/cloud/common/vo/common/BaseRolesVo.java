package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/13 9:52
 * @desc 后台角色 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseRolesVo {

    /**
     * 角色id
     */
    private long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 角色类型
     */
    private int typeId;

}
