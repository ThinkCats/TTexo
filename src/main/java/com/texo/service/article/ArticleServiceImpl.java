package com.texo.service.article;

import com.texo.common.util.FileOperate;
import com.texo.domain.dto.Article;
import org.springframework.stereotype.Service;

/**
 * Created by wl on 16/7/4.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public void newArticle(Article article) {
        FileOperate.genArticle(article);
    }
}
