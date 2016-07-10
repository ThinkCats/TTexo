package com.texo;

import com.texo.config.HexoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TexoApplication.class)
@WebAppConfiguration
public class TexoApplicationTests {

    @Autowired
    private HexoConfig hexoConfig;

	@Test
	public void contextLoads() {
        System.out.println(hexoConfig);
    }


}
