package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/2 18:41
 * @desc file desc
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportNoticeVo {

    /**
     *
     */
    private long id;

    private String _Id;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 日期
     */
    private String date;

    /**
     * 唯一标识
     */
    private int serial;

    /**
     * 是否处理
     */
    private int isHandle;

}
