package com.shisan.mall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shisan.mall.user.mapper")
public class ShisanMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShisanMallApplication.class, args);
    }

}
