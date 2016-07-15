package com.texo.service.article;

import com.texo.common.util.ConfigUitl;
import com.texo.common.util.FileOperate;
import com.texo.config.HexoConfig;
import com.texo.dao.ConfigDao;
import com.texo.domain.Config;
import com.texo.domain.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;

/**
 * Created by wl on 16/7/4.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private HexoConfig hexoConfig;
    @Autowired
    private ConfigDao configDao;

    @Override
    public void newArticle(Article article) {
        //get config
        Config config = configDao.findConfig();
        String path = config.getSitePath();
        if (StringUtils.isEmpty(path)) {
            path = System.getProperty("user.dir") + System.getProperty("file.separator") + config.getSiteName();
        }

        FileOperate.genArticle(path + hexoConfig.postDir, article);

    }
}