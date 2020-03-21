package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育开奖结果查询VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportResultSearchVo {


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
     * 体育类型
     */
    public int sportType;

    /**
     * 开奖类型
     */
    public int openType;


    /**
     * 日期
     */
    public Date date;

    public String startTime;

    public String endTime;

    public int page;

    public int pageSize;
}
