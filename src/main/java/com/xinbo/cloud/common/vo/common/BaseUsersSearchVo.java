package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/13 9:52
 * @desc 后台用户 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseUsersSearchVo {
    /**
     * 主键id
     */
    private String username;
    /**
     * 是否绑定IP
     */
    private Integer isBand;
    /**
     * 邮箱
     */
    private String emails;
    /**
     * 冻结标识 0 启用 1冻结
     */
    private Boolean nullity;
    /**
     * 管理员类型
     */
    private Integer adminType;

    /**
     * 是否锁定
     */
    private Integer isLock;
}
