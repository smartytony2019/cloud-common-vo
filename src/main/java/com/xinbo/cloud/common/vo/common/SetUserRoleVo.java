package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 汉斯
 * @date 2020/4/13 20:15
 * @desc 设置用户角色VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetUserRoleVo {
    /**
     * 用户ID
     */
    private long userId;
    /**
     * 角色列表
     */
    private List<BaseRolesVo> roles;
    /**
     * 管理员类型
     */
    private int typeId;
}
