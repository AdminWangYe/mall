package com.uestc.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yyWang
 * @create: 2020/7/4
 * @description:
 */
@Configuration
@MapperScan({"com.uestc.mall.mbg.mapper","com.uestc.mall.dao"})
public class MyBatisConfig {
}
