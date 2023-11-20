package com.atguigu.spzx.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 排除数据库的自动化配置，Cart微服务不需要访问数据库
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class , args) ;
    }
}
