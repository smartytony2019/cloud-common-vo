package com.xinbo.cloud.common.vo.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.util.pattern.PathPattern;

import java.util.List;

/**
 * @author 小富
 * @date 2020/4/1 14:04
 * @desc 结算VO
 */


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportBetSettleVo {

    private List<SportBetVo> list;

    private SportOpenResultVo resultVo;

}
