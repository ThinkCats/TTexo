package com.texo.service.config;

import com.texo.domain.Config;

/**
 * Created by wl on 16/7/12.
 */
public interface ConfigService {
    /**
     * Check Env
     */
    void checkEnv();

    void addConfig(Config config);

    Config findConfig();
}
