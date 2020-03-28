package com.xinbo.cloud.common.vo.sport;

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
public class SportAccountVo {

    /**
     * 主键
     */
    public String _id;

    /**
     * 用户id
     */
    public String id;

    /**
     * 排序
     */

    public String sort;

    /**
     * 用户名
     */

    public String username;

    /**
     * 是否有效
     */

    public String is_alive;

}
