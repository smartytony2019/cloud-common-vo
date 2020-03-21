package com.xinbo.cloud.common.vo.merchanta.bet;

import com.xinbo.cloud.common.vo.merchanta.api.PlatformApiRequestVo;

/**
 * @author 汉斯
 * @date 2020/3/16 18:16
 * @desc 余额转入转出请求实体
 */
public class QueryRequestVo extends PlatformApiRequestVo {

    /**
     * 查询开始时间  时间戳
     */
    private String startTime;

    /**
     * 查询开始时间  时间戳
     */
    private String endTime;

    /**
     * 查询开始时间  时间戳
     */
    private int pageIndex;

    /**
     * 查询开始时间  时间戳
     */
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
