package com.xinbo.cloud.common.vo.hg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汉斯
 * @date 2020/4/20 11:06
 * @desc 根据类目获取赛事集合的查询VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchSearchVo {
    /**
     * 类目ID
     */
    private int playId;
    /**
     * 联盟集合:name, name, name
     */
    private String leagues;
}
