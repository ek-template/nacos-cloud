package com.nacos.dubbo;

import com.didispace.alibaba.dubbo.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *********************************************************
 *
 * @Author <a href="mailto:xyqierkang@163.com">qierkang</a>
 * Blog: https://blog.csdn.net/qierkang
 * @Title DubboClientApplication.java
 * @Date Created in 2019-11-25 19:06
 * <p>Description: [ TODO ] </p>
 * <p>Copyright:    </p>
 * <p>Company:      </p>
 * <p>Department:   </p>
 * *********************************************************
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }

    @Slf4j
    @RestController
    static class TestController {

        @Reference
        HelloService helloService;

        @GetMapping("/test")
        public String test() {
            return helloService.hello("https://blog.csdn.net/qierkang");
        }
    }

}