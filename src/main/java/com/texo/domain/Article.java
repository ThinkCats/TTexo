package com.texo.domain;

import lombok.Data;

/**
 * Created by wl on 16/7/4.
 */
@Data
public class Article {
    private Integer id;
    private String title;
    private String category;
    private String content;
    private String tag;
    private Integer type;
}
