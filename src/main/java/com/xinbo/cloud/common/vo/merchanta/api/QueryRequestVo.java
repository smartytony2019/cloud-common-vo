package com.xinbo.cloud.common.vo.merchanta.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author 汉斯
 * @date 2020/3/16 18:16
 * @desc 余额转入转出请求实体
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryRequestVo  {

    /**
     * 签名
     */
    @NotEmpty(message = "签名不能为空")
    private String sign ;
    /**
     *  日期时间戳
     */
    @NotEmpty(message = "日期时间戳不能为空")
    private String time ;
    /**
     * 运营平台渠道
     */
    @NotEmpty(message = "平台渠道号不能为空")
    private String channel ;
    /**
     * 游戏ID
     */
    @NotEmpty(message = "游戏ID不能为空")
    private String gameId ;
    /**
     * 查询开始时间
     */
    @NotEmpty(message = "查询开始时间不能为空")
    private String startTime;

    /**
     * 查询开始时间
     */
    @NotEmpty(message = "查询开始时间不能为空")
    private String endTime;

    /**
     * 查询开始时间  时间戳
     */
    @Min(value = 1, message = "起始页为1")
    private int pageIndex;

    /**
     * 每页记录条数
     */
    @Min(value = 0, message = "每页记录条数必须大于0")
    private int pageSize;

}
