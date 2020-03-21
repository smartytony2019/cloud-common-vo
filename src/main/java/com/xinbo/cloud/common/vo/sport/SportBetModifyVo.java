package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/03/16
 * @desc 体育注单修改VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportBetModifyVo {

    /**
     * 修改注单号
     */
    public String[] billNos;

    /**
     * 注单状态
     */
    public int status;

}
