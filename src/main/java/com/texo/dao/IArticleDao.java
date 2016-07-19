package com.texo.dao;

import com.texo.domain.Article;

import java.util.List;

/**
 * Created by wl on 16/7/15.
 */
public interface IArticleDao {
    void save(Article article);

    Article findArticle(Integer id);

    List<Article> findArticleList();
}
