package com.xinbo.cloud.common.vo.hg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/27 0:30
 * @desc 皇冠账号查询
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountSearchVo {

    /**
     * 用户名
     */
    private String username;

    /**
     * 是否有效
     */
    private Boolean isAlive;

}
