package com.lww.serviceB.webApi;

/**
 * @description: 服务间调用  调用接口   有点和feign类似
 * @author: lww
 * @since: 2024/8/20
 */
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/server")
public interface ToDoService {
    /**
     * 测试
     * @param name
     * @return
     */
    @GetExchange("/test")
    String test(@RequestParam String name);

}
