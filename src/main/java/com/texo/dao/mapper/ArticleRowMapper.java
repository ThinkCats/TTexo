package com.texo.dao.mapper;

import com.texo.domain.Article;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wl on 16/7/15.
 */
public class ArticleRowMapper implements RowMapper<Article> {
    @Override
    public Article mapRow(ResultSet resultSet, int i) throws SQLException {
        Article article = new Article();
        article.setId(resultSet.getInt("id"));
        article.setTitle(resultSet.getString("title"));
        article.setCategory(resultSet.getString("category"));
        article.setTag(resultSet.getString("tag"));
        article.setContent(resultSet.getString("content"));
        return article;
    }
}
