package com.yulu.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yulu.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
