package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/21 9:52
 * @desc 后台模块 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseModuleVo {

    /**
     * 模块Id
     */
    private long moduleId;

}
