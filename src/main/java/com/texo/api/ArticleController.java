package com.texo.api;

import com.texo.common.beans.Result;
import com.texo.domain.Article;
import com.texo.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wl on 16/7/4.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "new", method = RequestMethod.POST)
    @ResponseBody
    public Result newArticle(@RequestParam("title") String title,
                             @RequestParam("category") String category,
                             @RequestParam("content") String content,
                             @RequestParam("tag") String tag,
                             @RequestParam("type") Integer type) {
        Article article = new Article();
        article.setTitle(title);
        article.setCategory(category);
        article.setContent(content);
        article.setTag(tag);
        article.setType(type);
        articleService.newArticle(article);
        return Result.success(null);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public Result listArticle() {
        List<Article> articles = articleService.findArticles();
        return Result.success(articles);
    }

}
