package com.alone.mmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.alone.mmall.mbg.mapper")
public class MybatisConfig {

}
