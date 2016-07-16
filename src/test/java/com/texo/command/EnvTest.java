package com.texo.command;

import com.texo.TexoApplicationTests;
import com.texo.domain.Env;
import com.texo.service.cmd.CmdService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wl on 16/7/16.
 */
@Slf4j
public class EnvTest extends TexoApplicationTests {

    @Autowired
    private CmdService cmdService;

    @Test
    public void testCheckEnv() {
        Env env = cmdService.checkEnv();
        log.info("Env : {}", env.toString());
    }
}
