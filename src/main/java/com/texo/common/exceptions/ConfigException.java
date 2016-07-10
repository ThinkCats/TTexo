package com.texo.common.exceptions;

/**
 * Created by wl on 16/7/7.
 */
public class ConfigException extends RuntimeException {
    public ConfigException(String message) {
        super(message);
    }

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}
