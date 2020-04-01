package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/1 15:22
 * @desc 任务调度注单查询VO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportBetTaskSearchVo {

    private long billNo;

    private int dataNode;

}
