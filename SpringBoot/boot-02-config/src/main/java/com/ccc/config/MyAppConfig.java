package com.ccc.config;

import com.ccc.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/23 13:26
 */

/*
* @Configuration:指明当前类是一个配置类，及时来替代之前的Spring配置文件
* */
@Configuration
public class MyAppConfig {

    //@Bean将方法的返回值添加到容器中，容器中的这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了。。。。");
        return new HelloService();
    }
}
