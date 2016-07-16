package com.texo.art;

import com.texo.TexoApplicationTests;
import com.texo.dao.IArticleDao;
import com.texo.domain.Article;
import com.texo.service.article.ArticleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wl on 16/7/15.
 */
public class TestArticle extends TexoApplicationTests {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private IArticleDao articleDao;

    @Test
    public void testAddArticle() {
        Article article = new Article();
        article.setTitle("MyTest");
        article.setTag("hehe");
        article.setCategory("hh");
        article.setContent("Hello");
        article.setType(1);
        articleService.newArticle(article);
    }

    @Test
    public void testQueryArticle() {
        List<Article> article = articleDao.findArticleList(1);
        System.out.println("articles :" + article.toString());
    }
}
