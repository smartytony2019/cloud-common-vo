package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/21 9:52
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

}
