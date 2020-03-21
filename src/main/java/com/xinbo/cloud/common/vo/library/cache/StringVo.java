package com.xinbo.cloud.common.vo.library.cache;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author 熊二
 * @date 2020/3/16 10:16
 * @desc String视图对象
 */

@Data
@Builder
public class StringVo {

    @NotEmpty(message = "key不能为空")
    private String key;

    @NotNull(message = "value不能为空")
    private Object value;

    @Min(value = 0, message = "不能小于0")
    private int expire;

}
