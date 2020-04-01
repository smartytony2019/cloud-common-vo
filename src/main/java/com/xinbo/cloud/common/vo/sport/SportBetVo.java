package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author 小富
 * @date 2020/4/1 11:47
 * @desc 体育注单VO
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportBetVo {

    /**
     * id
     */
    private long id;

    /**
     * 前端转换ID
     */
    private String _id;


    /**
     * 会员编号
     */
    private long userId;


    /**
     * 会员编号
     */
    private String _userId;

    /**
     * 会员名城管
     */
    private String userName;

    /**
     * 注单号
     */
    private long billNo;


    private String _billNo;

    /**
     * 商户号
     */
    private String merchantNo;


    /**
     * 投注金额
     */
    private float betMoney;


    /**
     * 可赢金额
     */
    private float canWinMoney;


    /**
     * 中奖金额
     */
    private float winMoney;


    /**
     * 派彩金额
     */
    private float payoutMoney;

    /**
     * 体育类型(1:足球, 2:篮球)
     */
    private int sportType;


    /**
     * 类目类型(1:滚球,2:今日,3:早盘,4:综合过关)
     */
    private int categoryType;


    /**
     * 玩法类型
     */
    private int playType;


    /**
     * 注单状态
     */
    private int status;

    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 结算时间
     */
    private Date settleTime;


    /**
     * 注单详情集合
     */
    private List<SportBetDetailVo> list;

    /**
     * 数据节点
     */
    private int dataNode;


    /**
     * 备注
     */
    private String Remark;


    /**
     * 体育类型(1:足球, 2:篮球)
     */
    private String sportTypeLabel;


    /**
     * 类目类型(1:滚球,2:今日,3:早盘,4:综合过关)
     */
    private String categoryTypeLabel;


    /**
     * 玩法描述
     */
    private String playTypeLabel;


    /**
     * 注单状态
     */
    private String statusLabel;

    /**
     * 数据节点
     */
    private String dateNodeLabel;
}
