package com.xinbo.cloud.common.vo.sport;


/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育赛事修改VO
 */
public class SportMatchModifyVo {

    public int gid;

    /**
     * 主队半场得分
     */
    public Integer hBgScore;

    /**
     * 客队半场得分
     */
    public Integer cBgScore;

    /**
     * 主队全场得分
     */
    public Integer hFullScore;

    /**
     * 客队全场得分
     */
    public Integer cFullScore;

    /**
     * 结算方式
     */
    public int status;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public Integer gethBgScore() {
        return hBgScore;
    }

    public void sethBgScore(Integer hBgScore) {
        this.hBgScore = hBgScore;
    }

    public Integer getcBgScore() {
        return cBgScore;
    }

    public void setcBgScore(Integer cBgScore) {
        this.cBgScore = cBgScore;
    }

    public Integer gethFullScore() {
        return hFullScore;
    }

    public void sethFullScore(Integer hFullScore) {
        this.hFullScore = hFullScore;
    }

    public Integer getcFullScore() {
        return cFullScore;
    }

    public void setcFullScore(Integer cFullScore) {
        this.cFullScore = cFullScore;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
