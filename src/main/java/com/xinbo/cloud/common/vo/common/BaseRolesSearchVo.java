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
public class BaseRolesSearchVo {

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型
     */
    private Integer typeId;

}
