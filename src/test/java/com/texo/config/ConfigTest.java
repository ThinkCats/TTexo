package com.texo.config;

import com.texo.TexoApplicationTests;
import com.texo.domain.Config;
import com.texo.service.config.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by wl on 16/7/15.
 */
@Slf4j
public class ConfigTest extends TexoApplicationTests {

    @Autowired
    private ConfigService configService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void addConfig() {
        Config config = new Config();
        config.setSiteName("TestBlog");
        config.setGit("GitTest");
        config.setHexo("HexoTest");
        config.setSitePath("");
        configService.addConfig(config);
    }

    @Test
    public void findConfig() {
        Config config1 = configService.findConfig();
        log.info("Config:{}", config1.toString());
    }

    @Test
    public void clearConfig() {
        String sql = "delete from config";
        jdbcTemplate.execute(sql);
    }
}
