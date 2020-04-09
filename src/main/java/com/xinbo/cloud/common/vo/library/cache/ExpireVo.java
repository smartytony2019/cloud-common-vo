package com.xinbo.cloud.common.vo.library.cache;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author 熊二
 * @date 2020/3/16 10:31
 * @desc TTL视图对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpireVo implements Serializable {

    @NotEmpty(message = "key不能为空")
    private String key;

    @Min(value = 1, message = "不能小于1")
    private long expire;

}
