package com.max.sell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author ZhiWeiMai
 *
 */
@SpringBootApplication
public class SellServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellServerApplication.class, args);
    }

}
