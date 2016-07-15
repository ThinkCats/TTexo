package com.texo.service.config;

import com.texo.dao.ConfigDao;
import com.texo.domain.Config;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wl on 16/7/12.
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    @Resource
    private ConfigDao configDao;

    @Override
    public void checkEnv() {

    }

    @Override
    public void addConfig(Config config) {
        configDao.addConfig(config);
    }

    @Override
    public Config findConfig() {
        return configDao.findConfig();
    }
}
