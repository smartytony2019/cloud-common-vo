package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育赛事查询VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportMatchSearchVo {

    /**
     * 体育类型
     */
    public int sportType;


    /**
     * 联赛名称
     */
    public String league;

    /**
     * 主队名
     */
    public String hName;

    /**
     * 客队名
     */
    public String cName;

    /**
     * 赛事状态
     */
    public int status;
}
