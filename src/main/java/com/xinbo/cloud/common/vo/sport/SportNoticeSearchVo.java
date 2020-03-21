package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育公告查询VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportNoticeSearchVo {

    /**
     *
     */
    public String _id;

    /**
     * 内容
     */
    public String content;

    /**
     * 是否处理
     */
    public int isHandle;

    /**
     * 时间类型
     */
    public int timetype;
}
