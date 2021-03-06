package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/13 9:52
 * @desc 后台菜单模块 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseModuleVo {

    /**
     * 模块Id
     */
    private long moduleId;

    /**
     * 父类Id
     */
    private long parentId;

    /**
     * 模块名称
     */
    private String title;

    /**
     * 链接
     */
    private String link;

    /**
     * 排序
     */
    private int sort;

    /**
     * 是否禁用
     */
    private boolean nullity;

    /**
     * 是否菜单
     */
    private int isMenu;

    /**
     * 描述
     */
    private String description;

    /**
     * 管理区
     */
    private int managerPopedom;

    /**
     * 图标
     */
    private String icon;

    /**
     * 顶级Id
     */
    private long topLevelId;

    /**
     * 是否代理
     */
    private int isMerchant;


}
