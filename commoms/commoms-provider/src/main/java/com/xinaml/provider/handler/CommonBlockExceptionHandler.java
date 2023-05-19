package com.xinaml.provider.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinaml.provider.result.CommonResult;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liguiqin
 * @date 2023/5/11
 */
@Component
public class CommonBlockExceptionHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        CommonResult result = new CommonResult();
        if (e instanceof FlowException) {
            result = CommonResult.fail(100, "接口限流了");
        }
        if (e instanceof DegradeException) {
            result = CommonResult.fail(101, "服务降级了");
        }
        if (e instanceof ParamFlowException) {
            result = CommonResult.fail(102, "热点参数限流了");
        }
        if (e instanceof SystemBlockException) {
            result = CommonResult.fail(103, "触发系统保护规则了");
        }
        if (e instanceof AuthorityException) {
            result = CommonResult.fail(104, "授权规则不通过");
        }
        //返回json数据
        httpServletResponse.setStatus(200);
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(httpServletResponse.getWriter(), result);
    }
}
