package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/21 9:53
 * @desc 后台角色模块 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseRoleModuleVo {

    /**
     * 角色id
     */
    private long roleId;

    /**
     * 模块id
     */
    private long moduleId;

    /**
     * 状态标识
     */
    private int stateFlag;

}
