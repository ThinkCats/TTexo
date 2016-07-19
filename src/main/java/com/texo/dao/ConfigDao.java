package com.texo.dao;

import com.texo.dao.mapper.ConfigRowMapper;
import com.texo.domain.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by wl on 16/7/14.
 */
@Repository
public class ConfigDao implements IConfigDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Config findConfig() {
        String sql = "SELECT  * FROM config";
        List<Config> configs = jdbcTemplate.query(sql, new ConfigRowMapper());
        if (configs.size() > 0) {
            return configs.get(0);
        }
        return null;
    }

    @Override
    public void addConfig(Config config) {
        String sql = "insert into config(site_name,git,hexo) values(?,?,?)";
        jdbcTemplate.update(sql, preparedStatement -> {
            preparedStatement.setString(1, config.getSiteName());
            preparedStatement.setString(2, config.getGit());
            preparedStatement.setString(3, config.getHexo());
        });
    }


}
