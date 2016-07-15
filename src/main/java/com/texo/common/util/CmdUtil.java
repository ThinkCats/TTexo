package com.texo.common.util;

import java.io.IOException;

/**
 * Created by wl on 16/7/12.
 */
public class CmdUtil {
    public static void exec(String cmd) throws IOException {
        Process process = Runtime.getRuntime().exec(cmd);
    }
}
