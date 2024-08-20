package com.lww.serviceB.config;

/**
 * @description:
 * @author: lww
 * @since: 2024/8/20
 */

import com.lww.serviceB.webApi.ToDoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * @Author xiarg
 * @CreateTime 2023/02/01  14:06
 */
@Configuration
public class WebConfig {

    @Bean
    WebClient webClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:8081")
                .build();
    }
    
    /** 
     *
     * 实际远程调用的实现
     * @return        
     * @author lww
     * @date 2024/8/20
     */
    @Bean
    ToDoService toDoService() {
        HttpServiceProxyFactory proxyFactory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient())).build();
        return proxyFactory.createClient(ToDoService.class);
    }


}
