package com.texo.common.util;

import com.texo.domain.dto.Article;
import org.apache.commons.lang.time.DateFormatUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by wl on 16/7/4.
 */
public class FileOperate {

    //生成文章文件
    public static void genArticle(String path, Article article) {
        Charset utf8 = StandardCharsets.UTF_8;
        String title = "title: " + article.getTitle();
        String date = "date: " + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        String tags = "tags: " + article.getTag();
        String category = "categories: " + article.getCategory();
        String fileName = article.getTitle() + ".md";
        List<String> lines = Arrays.asList("---", title, date, tags, category, "---", article.getContent());
        try {
            Files.write(Paths.get(path + System.getProperty("file.separator") + fileName), lines, utf8, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //生成文章的头信息
    public static void genHeader(String text) {

    }
}
