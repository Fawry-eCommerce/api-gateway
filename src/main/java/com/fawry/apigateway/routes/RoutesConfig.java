package com.fawry.apigateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("product-service", r -> r.path("/product-api/**")
                        .uri("lb://product-service/**"))
                .route("admin-service", r -> r.path("/admin-api/**")
                        .uri("lb://admin-service/**"))
                .route("store-service", r -> r.path("/store-api/**")
                        .uri("lb://store-service/**"))
                .route("coupon-service", r -> r.path("/coupon-api/**")
                        .uri("lb://coupon-service/**"))
                .route("notification-service", r -> r.path("/notification-api/**")
                        .uri("lb://notification-service/**"))
                .route("order-service", r -> r.path("/order-api/**")
                        .uri("lb://order-service/**"))
                .build();
    }

}
