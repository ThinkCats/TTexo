package com.texo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityLayoutView;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

/**
 * Created by wl on 16/6/29.
 */
@Order(1)
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        VelocityLayoutViewResolver viewResolver = new VelocityLayoutViewResolver();
        viewResolver.setCache(false);
        viewResolver.setViewClass(VelocityLayoutView.class);
        viewResolver.setLayoutUrl("/layout/main.vm");
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".vm");
        viewResolver.setExposeSpringMacroHelpers(true);
        viewResolver.setContentType("text/html;charset=UTF-8");
        registry.viewResolver(viewResolver);
    }

}
