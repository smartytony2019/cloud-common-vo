package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/2 17:30
 * @desc file desc
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BetDetailSearchVo {

    private int gid;

    private int isLucky;

}
