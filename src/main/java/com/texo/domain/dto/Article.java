package com.texo.domain.dto;

import lombok.Data;

/**
 * Created by wl on 16/7/4.
 */
@Data
public class Article {
    private String title;
    private String category;
    private String content;
    private String tag;
}