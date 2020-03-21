package com.xinbo.cloud.common.vo.library.cache;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author 熊二
 * @date 2020/3/16 10:31
 * @desc TTL视图对象
 */
@Data
@Builder
public class ExpireVo {

    @NotEmpty(message = "key不能为空")
    private String key;

    @Min(value = 1, message = "不能小于1")
    private long expire;

}
