package com.texo.dao;

import com.texo.dao.mapper.ConfigRowMapper;
import com.texo.domain.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by wl on 16/7/14.
 */
@Component("configDao")
public class ConfigDao implements IConfigDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Config findConfig(String sql) {
        return jdbcTemplate.queryForObject(sql, new ConfigRowMapper());
    }
}
