package com.xinbo.cloud.common.vo.hg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马仔
 * @date 2020/3/27 0:30
 * @desc 皇冠账号查询
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountVo {
    private String _id;
    private String id;
    private String node;
    private String password;
    private String username;
    private Boolean isAlive;
    private int Sort;

}
