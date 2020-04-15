package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 汉斯
 * @date 2020/4/13 17:31
 * @desc 设置角色菜单权限VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveRolePermissionVo {
    /**
     * 角色ID
     */
    private long roleId;
    /**
     * 菜单列表
     */
    private List<BaseModuleVo> modulePermissions;
}
