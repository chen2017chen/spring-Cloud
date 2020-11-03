package com.ccc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/8 16:24
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return  new RandomRule();//定义为随机
    }
}
