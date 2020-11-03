package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/20 0:13
 */

@Configuration//作为配置类，替代xml文件
@ComponentScan(basePackages = {"com.ccc"} )//开启组件扫描
public class SpringConfig {
}
