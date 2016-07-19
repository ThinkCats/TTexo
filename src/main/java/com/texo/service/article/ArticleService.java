package com.texo.service.article;

import com.texo.domain.Article;

import java.util.List;

/**
 * Created by wl on 16/7/4.
 */
public interface ArticleService {
    void newArticle(Article article);

    List<Article> findArticles();
}
