package com.xinbo.cloud.common.vo.pay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小富
 * @date 2020/4/16 15:39
 * @desc file desc
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChannelOperationVo {

    private int id;
    private String ChannelName;
    private String ChannelCode;
    private int IsOpen;


}
