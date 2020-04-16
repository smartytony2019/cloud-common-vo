package com.xinbo.cloud.common.vo.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/3/31 14:04
 * @desc 用户查询 vo
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoSearchVo {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 注册IP
     */
    private String regIp;
    /**
     * 登录IP
     */
    private String loginIp;
    /**
     * 对应枚举DateTypeEnum   1：登录时间 2：注册时间
     */
    private  int dateType;
    /**
     * 开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 用户状态 0:正常,1:异常,2:停用
     */
    private Integer status;

    /**
     * 用户类型(0:正常  2:试玩)
     */
    private Integer type;

}
