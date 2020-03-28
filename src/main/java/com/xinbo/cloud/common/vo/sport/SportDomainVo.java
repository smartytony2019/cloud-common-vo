package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/27 0:37
 * @desc 皇冠域名 vo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportDomainVo {

    /**
     * 主键id
     */
    public String _id;

    /**
     * 域名
     */
    public String domain;

    /**
     * 是否可用
     */
    public boolean is_alive;

    /**
     * 是否当前使用
     */
    public boolean is_current_use;

    /**
     * 用户当前UID
     */
    public String uid;

    /**
     * 延迟
     */
    public int ping;

    /**
     * 用户id
     */
    public String id;

    /**
     * 用户名
     */
    public String username;

    /**
     * 当前使用域名
     */
    public String use_domain;

}
