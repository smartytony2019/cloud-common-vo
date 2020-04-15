package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/13 9:52
 * @desc 后台菜单模块查询 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseModuleSearchVo {
    /**
     * 父类Id
     */
    private long parentId;

    /**
     * 模块名称
     */
    private String title;

    /**
     * 是否禁用
     */
    private Boolean nullity;

    /**
     * 是否菜单
     */
    private Integer isMenu;
    /**
     * 顶级Id
     */
    private long topLevelId;
    /**
     * 是否代理
     */
    private Integer isMerchant;

}
