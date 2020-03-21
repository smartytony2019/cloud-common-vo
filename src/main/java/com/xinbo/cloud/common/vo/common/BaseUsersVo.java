package com.xinbo.cloud.common.vo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/21 9:33
 * @desc 后台用户 vo
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseUsersVo {

    /**
     * 主键id
     */
    private long userId;
}
