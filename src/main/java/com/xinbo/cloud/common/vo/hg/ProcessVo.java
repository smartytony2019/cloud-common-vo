package com.xinbo.cloud.common.vo.hg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 汉斯
 * @date 2020/4/19 17:08
 * @desc 爬取线程实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessVo implements Serializable {
    /**
     * mongodb主键
     */
    private String _id;
    /**
     * 类型
     */
    private String type;
    /**
     * 启动线程数
     */
    private int launchNum;
    /**
     * 完成线程数
     */
    private int doneNum;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 备注
     */
    private  String remark;
}
