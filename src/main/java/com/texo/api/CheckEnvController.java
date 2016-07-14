package com.texo.api;

import com.texo.common.beans.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wl on 16/7/12.
 */
@Controller
public class CheckEnvController {

    @RequestMapping("/checkEnv")
    public Result checkEnv(){
        
        return Result.success(null);
    }

}
