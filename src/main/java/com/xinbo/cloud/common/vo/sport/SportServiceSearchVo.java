package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 小富
 * @date 2020/3/19 17:03
 * @desc 体育模块查询VO
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportServiceSearchVo {

    /**
     * 体育类型
     */
    private int sportType;

    /**
     * 日期
     */
    private Date createTime;

    /**
     * 用户id
     */
    private long userId;

    /**
     * 数据节点
     */
    private int dateNode;

    /**
     * 商户号
     */
    public String merchantCode;

}

