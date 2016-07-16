package com.texo.service.cmd;

import com.texo.common.exceptions.ConfigException;
import com.texo.domain.Env;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by wl on 16/7/16.
 */
@Service
public class CmdServiceImpl implements CmdService {
    @Override
    public Env checkEnv() {
        Env env = new Env();
        String git = envValidate("git --version", "Git命令未检测到,请确认Git已安装,并且添加到了环境变量中");
        env.setGit(git);
        String hexo = envValidate("hexo -version", "Hexo-cli命令未检测到,请确认hexo-cli命令行已经全局安装");
        String[] hexoArray = hexo.split("\n");
        if (hexoArray.length > 0) {
            env.setHexo(hexoArray[0]);
        } else {
            throw new ConfigException("Hexo-cli命令未检测到,请确认hexo-cli命令行已经全局安装");
        }
        return env;
    }

    private String envValidate(String cmd, String message) {
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            return IOUtils.toString(process.getInputStream(), "UTF-8");
        } catch (IOException e) {
            throw new ConfigException(message);
        }
    }
}
