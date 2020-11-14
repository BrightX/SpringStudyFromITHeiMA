package com.bright.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 徐亮亮
 * @since 2020/11/14
 */
@Configuration  // 标志该类是Spring核心配置文件
// <context:component-scan base-package="com.bright"/>
@ComponentScan("com.bright")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
}
