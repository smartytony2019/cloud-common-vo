package com.xinbo.cloud.common.vo.lottery;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/28 11:14
 * @desc 彩种维护记录表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryMaintenanceVo implements Serializable {
    /**
     * 主键
     */
    private long id;
    /**
     * 彩种类型编号
     */
    private int categoryCode;
    /**
     * 彩种编号
     */
    private int lotteryTypeCode;
    /**
     * 彩种名称
     */
    private String lotteryTypeName;
    /**
     * 开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;
    /**
     * 结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    /**
     * 类型 1公休2维护
     */
    private int maintainType;
    /**
     * 说明
     */
    private String description;
    /**
     * 排序号
     */
    private int sort;
    /**
     * 备注
     */
    private String remark;
}
