package com.xinbo.cloud.common.vo.sport;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author 小富
 * @date 2020/4/1 12:28
 * @desc file desc
 */
public class SportOpenResultVo {

    /**
     *
     */
    public long id;

    /**
     *
     */
    public String _Id;

    /**
     * 体育类型(1:足球, 2:篮球)
     */
    public int sportType;
    /**
     * 联盟
     */
    public String league;

    /**
     * 游戏ID
     */
    public int gid;

    /**
     * 开奖时间
     */
    public String dt;

    /**
     * 主队名
     */
    @JsonProperty(value = "h_name")
    @JsonAlias("hName")
    public String hName;

    /**
     * 客队名
     */
    @JsonProperty(value = "c_name")
    @JsonAlias("cName")
    public String cName;

    /**
     * 主队半场得分
     */
    @JsonProperty(value = "h_bg_score")
    @JsonAlias("hBgScore")
    public String hBgScore;

    /**
     * 客队半场得分
     */
    @JsonProperty("c_bg_score")
    @JsonAlias("cBgScore")
    public String cBgScore;

    /**
     * 主队全场得分
     */
    @JsonProperty(value = "h_full_score")
    @JsonAlias("hFullScore")
    public String hFullScore;

    /**
     * 客队全场得分
     */
    @JsonProperty(value = "c_full_score")
    @JsonAlias("cFullScore")
    public String cFullScore;

    /**
     * 投注金额
     */
    public float betMoney;

    /**
     * 中奖金额
     */
    public float winMoney;

    /**
     * 是否结算
     */
    public int isSettle;

    /**
     * 来源(0:未开奖(默认值), 1:采集开奖, 2:手动开奖)
     */
    public int source;

    /**
     * 开奖类型(1.赛事2.冠军)
     */
    public int openType;

    /**
     * 结果类型(0:未开奖,1:半场开奖，2:全场开奖) ,3.全部开奖
     */
    public int resultType;

    /**
     * 体育类型
     */
    public String sportTpeLabel;
}
