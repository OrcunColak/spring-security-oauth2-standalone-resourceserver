package com.colak.springsecurityoauth2standaloneresourceserver.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class AuthFilter implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        // not a recommended option for prod for upper environments
        log.info("AUTH header value {}", exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION));
        return chain.filter(exchange);
    }
}