package com.xinbo.cloud.common.vo.merchanta.api;

import com.xinbo.cloud.common.vo.merchanta.api.PlatformApiRequestVo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author 汉斯
 * @date 2020/3/16 18:16
 * @desc 余额转入转出请求实体
 */
public class QueryRequestVo extends PlatformApiRequestVo {

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

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
