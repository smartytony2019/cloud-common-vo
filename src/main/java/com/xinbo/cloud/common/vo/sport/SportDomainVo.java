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
     * 域名
     */
    private String domain;

    /**
     * 延迟
     */
    private int ping;

    /**
     * 是否有效
     */
    private boolean is_alive;

    /**
     * 是否当前使用
     */
    private boolean is_current_use;

}
