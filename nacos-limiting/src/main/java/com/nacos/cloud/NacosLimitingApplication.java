package com.nacos.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * *********************************************************
 *
 * @Author <a href="mailto:xyqierkang@163.com">qierkang</a>
 * Blog: https://blog.csdn.net/qierkang
 * @Title NacosLimitingApplication.java
 * @Date Created in 2019-11-25 19:05
 * <p>Description: [ TODO ] </p>
 * <p>Copyright:    </p>
 * <p>Company:      </p>
 * <p>Department:   </p>
 * *********************************************************
 */
@SpringBootApplication
public class NacosLimitingApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosLimitingApplication.class, args);
    }

    @Slf4j
    @RestController
    static class TestController {

        @GetMapping("/hello")
        public String hello() {
            return "https://blog.csdn.net/qierkang";
        }

    }

}