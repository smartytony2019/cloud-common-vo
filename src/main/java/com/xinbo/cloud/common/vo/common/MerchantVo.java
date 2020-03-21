package com.xinbo.cloud.common.vo.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
/**
 * @author 汉斯
 * @date 2020/3/11 9:50
 * @desc 商户VO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantVo {

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 商户编号
     */
    @NotEmpty(message = "商户编号不能为空")
    private String merchantCode;

    /**
     * 商户名称
     */
    @NotEmpty(message = "商户名称不能为空")
    private String merchantName;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 商户状态
     */
    private boolean status;

    /**
     * 商户密钥
     */
    @NotEmpty(message = "商户密钥不能为空")
    private String merchantKey;

    /**
     * 商户密码
     */
    @NotEmpty(message = "商户密码不能为空")
    private String passWord;


    /**
     * Api地址
     */
    private String apiAddress;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序号
     */
    private int sort;

    /**
     * 数据节点(枚举:EnumMyCatDataNode)
     */
    private int dataNode;
}
