package com.xinbo.cloud.common.vo.library.cache;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author 熊二
 * @date 2020/3/16 10:18
 * @desc List视图对象
 */
@Data
@Builder
public class ListVo {

    @NotEmpty(message = "key不能为空")
    private String key;

    @NotNull(message = "value不能为空")
    private List<Object> value;
}
