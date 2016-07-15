package com.texo.command;

import com.texo.TexoApplicationTests;
import com.texo.domain.dto.Article;
import com.texo.service.article.ArticleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wl on 16/7/15.
 */
public class ArtTest extends TexoApplicationTests {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testArtPost() {
        Article article = new Article();
        article.setTitle("test");
        article.setContent("hehehehhehehe......");
        article.setCategory("category");
        article.setTag("tag");
        articleService.newArticle(article);
    }
}
