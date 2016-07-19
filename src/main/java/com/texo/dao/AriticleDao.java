package com.texo.dao;

import com.texo.dao.mapper.ArticleRowMapper;
import com.texo.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wl on 16/7/15.
 */
@Repository
public class AriticleDao implements IArticleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Article article) {
        String sql = "INSERT INTO article(title,category,tag,content,type,create_date,update_date)" +
                " VALUES (?,?,?,?,?,now(),now())";
        jdbcTemplate.update(sql, ps -> {
            ps.setString(1, article.getTitle());
            ps.setString(2, article.getCategory());
            ps.setString(3, article.getTag());
            ps.setString(4, article.getContent());
            ps.setInt(5, article.getType());
        });
    }

    @Override
    public Article findArticle(Integer id) {
        String sql = "select * from article WHERE id = " + id;
        Article article = jdbcTemplate.queryForObject(sql, new ArticleRowMapper());
        return article;
    }

    @Override
    public List<Article> findArticleList() {
        String sql = "select * from article";
        List<Article> articles = jdbcTemplate.query(sql, new ArticleRowMapper());
        return articles;
    }
}
