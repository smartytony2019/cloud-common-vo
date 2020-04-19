package com.xinbo.cloud.common.vo.hg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/4/19 17:07
 * @desc 皇冠域名实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DomainVo implements Serializable {
    /**
     * mongodb主键
     */
    private String _id;
    /**
     * 用户id
     */
    private String id;
    /**
     * 数据节点
     */
    private String node;
    /**
     * 域名
     */
    private String domain;
    /**
     * 登录UID
     */
    private String uid;
    /**
     * 延迟
     */
    private String ping;
    /**
     * 是否可用
     */
    private Boolean isAlive;
    /**
     * 是否当前使用
     */
    private Boolean isCurrentUse;
    /**
     * 当前使用域名
     */
    private String useDomain;
    /**
     * 用户名
     */
    private String username;
}
