package cn.bhu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"cn.bhu.domain", "cn.bhu.service", "cn.bhu.dao"})
@PropertySource("classpath:dbconfig.properties")
public class SpringConfig { }