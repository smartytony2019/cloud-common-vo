package com.xinbo.cloud.common.vo.lottery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/29 13:41
 * @desc 彩票各表对boolean单字段修改VO类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryUpdateBooleanFieldVo {
    /**
     * 主键
     */
    private long id;
    /**
     * 字段名
     */
    private String keyName;
    /**
     * 字段值
     */
    private boolean keyValue;

}
