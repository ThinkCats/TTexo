package com.texo.common.util;

import java.util.Properties;

/**
 * Created by wl on 16/7/15.
 */
public class ConfigUitl {
    private static Properties props = new Properties();

    public static String getValue(String key) {
        return props.getProperty(key);
    }
}
