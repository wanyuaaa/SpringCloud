package com.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanyu
 * @createTime 2022-04-04 21:53
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_angenin1", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"));

        routes.route("path_route_angenin2", r -> r.path("/guoji").uri("http://news.baidu.com/guoji"));

        return routes.build();
    }

//    @Bean
//    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//
//        routes.route("path_route_angenin2",  //id
//                r -> r.path("/guoji")  //访问 http://localhost:9527/guoji
//                        .uri("http://news.baidu.com/guoji"));  //就会转发到 http://news.baidu.com/guonji
//
//        return routes.build();
//    }

}

