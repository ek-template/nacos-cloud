package com.nacos.dubbo;

import com.didispace.alibaba.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * *********************************************************
 *
 * @Author <a href="mailto:xyqierkang@163.com">qierkang</a>
 * Blog: https://blog.csdn.net/qierkang
 * @Title HelloServiceImpl.java
 * @Date Created in 2019-11-25 19:06
 * <p>Description: [ 注意：是 org.apache.dubbo.config.annotation.Service 注解 ] </p>
 * <p>Copyright:    </p>
 * <p>Company:      </p>
 * <p>Department:   </p>
 * *********************************************************
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }

}