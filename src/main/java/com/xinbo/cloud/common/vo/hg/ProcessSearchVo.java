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
public class ProcessSearchVo implements Serializable {
    /**
     * 类型
     */
    private String type;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
}
