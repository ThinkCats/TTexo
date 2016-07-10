package com.texo.command;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by wl on 16/7/10.
 */
public class GenProj {
    @Test
    public void testGenProj(){
        String cmd = "hexo init TestBlog";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            String result = IOUtils.toString(process.getInputStream(),"UTF-8");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
