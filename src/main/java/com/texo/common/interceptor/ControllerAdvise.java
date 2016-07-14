package com.texo.common.interceptor;

import com.texo.common.beans.Result;
import com.texo.common.exceptions.ConfigException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wl on 16/7/7.
 */

@ControllerAdvice(basePackages = "com.texo.api")
public class ControllerAdvise {

    @ExceptionHandler(ConfigException.class)
    public Result handleConfig(HttpServletRequest request, ConfigException e) {
        return Result.fail(e.getMessage());
    }

}
