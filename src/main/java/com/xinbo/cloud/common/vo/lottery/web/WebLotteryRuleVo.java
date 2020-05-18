package com.xinbo.cloud.common.vo.lottery.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 汉斯
 * @date 2020/5/6 12:51
 * @desc 前端彩票规则显示
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebLotteryRuleVo implements Serializable {
    /**
     * 彩种code
     */
    private int lotteryTypeCode ;

    /**
     * 彩种名称
     */
    private String lotteryTypeName ;

    /**
     * 官方规则
     */
    private String gfLotteryRule ;

    /**
     * 信用规则
     */
    private String xyLotteryRule ;

    /**
     * 彩种规则
     */
    private String lotteryRule ;

    /**
     * H5图标
     */
    private String h5Icon;
    /**
     * PC大图标
     */
    private String bigIcon;
    /**
     * PC小图标
     */
    private String smallIcon;
}
