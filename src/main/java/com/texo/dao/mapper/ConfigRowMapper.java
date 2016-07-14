package com.texo.dao.mapper;

import com.texo.domain.Config;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wl on 16/7/14.
 */
public class ConfigRowMapper implements RowMapper<Config> {
    @Override
    public Config mapRow(ResultSet resultSet, int i) throws SQLException {
        Config config = new Config();
        config.setId((long) resultSet.getInt("id"));
        config.setGit(resultSet.getString("git"));
        config.setHexo(resultSet.getString("hexo"));
        config.setSiteName(resultSet.getString("site_name"));
        config.setSitePath(resultSet.getString("site_path"));
        return config;
    }
}
