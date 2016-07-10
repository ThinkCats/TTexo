package com.texo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by wl on 16/7/5.
 */
@Configuration
@PropertySource("classpath:config.properties")
public class HexoConfig {
    @Value("${hexo.location}")
    private String hexoLocation;
    @Value("${hexo.generate}")
    private Boolean hexoGenerate;
}
