package com.game.plane.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan(basePackages = {"com.game.plane.web"})
@Import({
        CoreWebSecurityConfig.class
})
public class WebConfig extends WebMvcConfigurationSupport {
}
