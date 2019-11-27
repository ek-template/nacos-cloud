package com.nacos.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * *********************************************************
 *
 * @Author <a href="mailto:xyqierkang@163.com">qierkang</a>
 * Blog: https://blog.csdn.net/qierkang
 * @Title DubboServerApplication.java
 * @Date Created in 2019-11-25 19:06
 * <p>Description: [ TODO ] </p>
 * <p>Copyright:    </p>
 * <p>Company:      </p>
 * <p>Department:   </p>
 * *********************************************************
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServerApplication.class, args);
    }


}