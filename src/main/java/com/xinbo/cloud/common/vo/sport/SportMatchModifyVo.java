package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育赛事修改VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
