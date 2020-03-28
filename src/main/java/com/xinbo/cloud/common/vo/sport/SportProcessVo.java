package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 马仔
 * @date 2020/3/27 0:38
 * @desc 皇冠线程 vo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportProcessVo {

    /**
     * 主键id
     */
    public String _id;

    /**
     * 开始时间
     */
    public Date start_time;

    /**
     * 结束时间
     */
    public Date end_time;

    /**
     * 启动线程
     */
    public int launch_num;

    /**
     * 完成线程
     */
    public int done_num;

    /**
     * 线程类型
     */
    public String type;

    /**
     * 线程备注
     */
    public String remark;

}
