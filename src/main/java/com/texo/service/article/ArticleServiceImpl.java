package com.texo.service.article;

import com.texo.common.util.FileOperate;
import com.texo.dao.ConfigDao;
import com.texo.domain.Config;
import com.texo.domain.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by wl on 16/7/4.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ConfigDao configDao;

    @Override
    public void newArticle(Article article) {
        //get config
        String sql = "select * from config";
        Config config = configDao.findConfig(sql);
        String path = config.getSitePath();
        if (StringUtils.isEmpty(path)){
            path = ".";
        }
        FileOperate.genArticle(path + "/post",article);
    }
}
