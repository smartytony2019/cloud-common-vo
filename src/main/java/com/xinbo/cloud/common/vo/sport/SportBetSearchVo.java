package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育注单查询VO
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportBetSearchVo {

    /**
     * 用户名
     */
    public String userName;

    /**
     * 注单号
     */
    public String billNo;

    /**
     * 状态
     */
    public int status;

    /**
     * 体育类型
     */
    public List<Integer> sportTypes;

    /**
     * 类目
     */
    public List<Integer> categoryTypes;

    /**
     * 时间标识
     */
    public String timeLabel;

    /**
     * 开始时间
     */
    public Date startTimes;

    /**
     * 结束时间
     */
    public Date endTime;


    /**
     * 联赛名称
     */
    public String league;

    /**
     * 主队名
     */
    public String hName;


    /**
     * 主队名是否模糊搜索
     */
    public Boolean hNameIsLike;
    /**
     * 客队名
     */
    public String cName;

    /**
     * 客队名是否模糊搜索
     */
    public Boolean cNameIsLike;

    /**
     * 商户编号
     */
    public String merchantCode;

    /**
     * 是否查询所有商户数据
     */
    public Boolean isAllMerchant;

    /**
     * 数据节点
     */
    public int dataNode;

    /**
     * 订单
     */
    public List<Long> billNos;

    /**
     * 页码
     */
    public int page;

    /**
     * 页尺寸
     */
    public int pageSize;
}

