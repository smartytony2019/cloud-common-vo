package com.xinbo.cloud.common.vo.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

/**
 * @author 马仔
 * @date 2020/3/16 12:04
 * @desc 用户信息 vo
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo {

    /**
     * 用户Id 对应前端
     */
    private String _userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户余额
     */
    private float money;

    /**
     * 用户冻结金额
     */
    private float frozen_money;

    /**
     * 用户所属平台
     */
    private String merchantCode;

    /**
     * 注册时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regTime;

    /**
     * 登录时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginTime;

    /**
     * 用户状态 0:正常,1:异常,2:停用
     */
    private int status;

    /**
     * 用户类型(0:正常  2:试玩)
     */
    private int type;

    /**
     * 数据节点(枚举:EnumMyCatDataNode)
     */
    private int dataNode;

}
