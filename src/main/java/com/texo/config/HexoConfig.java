package com.texo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by wl on 16/7/5.
 */
@Configuration
@PropertySource("classpath:config.properties")
public class HexoConfig {

    @Value("${hexo.post_dir}")
    public String postDir;

}
