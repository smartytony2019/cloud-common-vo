package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/1 17:02
 * @desc file desc
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameConfigSearchVo {

    private int category;

    private String key;

}
