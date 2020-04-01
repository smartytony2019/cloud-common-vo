package com.xinbo.cloud.common.vo.sport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 小富
 * @date 2020/4/1 11:48
 * @desc 注单详情VO
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportBetDetailVo {

    /**
     * 注单号
     */
    private long billNo;

    /**
     * 联盟
     */
    private String league;

    /**
     * 主队
     */
    @JsonProperty(value = "hName")
    private String hName;

    /**
     * 客队
     */
    @JsonProperty(value = "cName")
    private String cName;

    /**
     * 游戏id
     */
    private int gid;

    /**
     * 赔率
     */
    private double odds;

    /**
     * 投注内容
     */
    private String content;

    /**
     * 附加信息(让球数,大小,等等信息...)
     */
    private String info;

    /**
     * 投注类型(ior_MH表示:主队独赢, hratio_o表示:半场大小数, 等等...)
     */
    private int betType;


    /**
     * 球方(H:主队,C:客队)
     */
    private String team;

    /**
     * 是否中奖
     */
    private int isLucky;

    /**
     * 半场开奖结果
     */
    private String halfOpenResult;

    /**
     * 全场开奖结果
     */
    private String fullOpenResult;

    /**
     * 赛事开始时间
     */
    private Date matchStartTime;

    /**
     * 全场/半场
     */
    private int fullHalf;


    /**
     * 状态
     */
    private int status;

    /**
     * 开奖结果
     */
    private SportOpenResultVo openResult;

    /**
     * 数据节点
     */
    private int dataNode;

    /**
     * 是否单式
     */
    private Boolean isSingle;


    /**
     * 全场/半场
     */
    private String fullHalfLabel;
}
