package com.ccc.springCloud.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


import java.util.Date;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/13 16:40
 */

@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*************come in MyLogGateWayFilter:"+new Date());
        String yourname=exchange.getRequest().getQueryParams().getFirst("yourname");
        if(yourname==null){
            log.info("用户名为null，非法用户，/(ㄒoㄒ)/~~");
            exchange.getResponse().setStatusCode((HttpStatus.NOT_ACCEPTABLE));
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
