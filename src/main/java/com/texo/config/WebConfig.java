package com.texo.config;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    public void test() {

    }

    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        source.registerCorsConfiguration("/**", config);
        final FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }
}
