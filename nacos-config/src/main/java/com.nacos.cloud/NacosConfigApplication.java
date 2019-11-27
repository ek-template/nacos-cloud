package com.nacos.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *********************************************************
 *
 * @Author <a href="mailto:xyqierkang@163.com">qierkang</a>
 * Blog: https://blog.csdn.net/qierkang
 * @Title NacosConfigApplication.java
 * @Date Created in 2019-11-25 19:10
 * <p>Description: [ TODO ] </p>
 * <p>Copyright:    </p>
 * <p>Company:      </p>
 * <p>Department:   </p>
 * *********************************************************
 */
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
    }

    @Slf4j
    @RestController
    @RefreshScope
    static class TestController {

        @Value("${qierkang.title:}")
        private String title;

        @GetMapping("/test")
        public String hello() {
            System.out.println("1111");
            return title;
        }

    }
}