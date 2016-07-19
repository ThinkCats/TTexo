package com.texo.service.article;

import com.texo.common.util.FileOperate;
import com.texo.config.HexoConfig;
import com.texo.dao.IArticleDao;
import com.texo.dao.IConfigDao;
import com.texo.domain.Config;
import com.texo.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by wl on 16/7/4.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private HexoConfig hexoConfig;
    @Autowired
    private IConfigDao configDao;
    @Autowired
    private IArticleDao articleDao;

    @Override
    public void newArticle(Article article) {
        //get config
        Config config = configDao.findConfig();
        String path = config.getSitePath();
        if (StringUtils.isEmpty(path)) {
            path = System.getProperty("user.dir") + System.getProperty("file.separator") + config.getSiteName();
        }

        FileOperate.genArticle(path + hexoConfig.postDir, article);
        articleDao.save(article);
    }

    @Override
    public List<Article> findArticles() {
        return articleDao.findArticleList();
    }
}