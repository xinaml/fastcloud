package com.xinaml.result;

/**
 * @author liguiqin
 * @date 2022/9/28
 */

public class CommonResult {
    private Integer code;//返回状态码
    private String msg;//返回是否调用成功
    private Object data; //返回的数据
    public CommonResult() {
    }
    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }

    public CommonResult(Integer code, String msg,Object data) {
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
    public static CommonResult fail(String msg, Object data) {
        return new CommonResult(-1, msg, data);
    }

    public static CommonResult fail(Integer code, String msg) {
        return new CommonResult(code, msg, null);
    }

    public static CommonResult success(String msg, Object data) {
        return new CommonResult(200, msg, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
