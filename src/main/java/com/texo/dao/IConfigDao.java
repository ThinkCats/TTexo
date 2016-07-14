package com.texo.dao;

import com.texo.domain.Config;

/**
 * Created by wl on 16/7/14.
 */
public interface IConfigDao {
    Config findConfig(String sql);
}
