package com.texo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wl on 16/6/29.
 */
@Controller
public class Views {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
