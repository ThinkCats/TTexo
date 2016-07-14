package com.texo.common.beans;

/**
 * Created by wl on 16/7/12.
 */
public class Result<T> {
    private Integer code;
    private Boolean success;
    private T data;

    public static <T> Result<T> success(T data){
        Result result = new Result();
        result.setCode(200);
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(T data){
        Result result = new Result();
        result.setCode(500);
        result.setSuccess(false);
        result.setData(data);
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
