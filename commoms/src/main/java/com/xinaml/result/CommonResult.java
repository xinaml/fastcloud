package com.xinaml.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult {
    private Integer code;//返回状态码
    private String msg;//返回是否调用成功
    private Object data; //返回的数据

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }
    public static CommonResult fail(String msg,Object data){
       return new CommonResult(-1, msg, data);
    }

    public static CommonResult fail(Integer code,String msg){
       return new CommonResult(code, msg, null);
    }

    public static CommonResult success(String msg,Object data){
       return new CommonResult(200, msg, data);
    }
}
