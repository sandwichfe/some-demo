package com.lww.serviceB.controller;

import com.lww.serviceB.webApi.ToDoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lww
 * @since: 2024/8/20
 */
@RestController
public class TestController {

    @Resource
    private ToDoService toDoService;

    @GetMapping("/test")
    public String test(){
        // 调A的服务接口
        String test = toDoService.test("test1");
        System.out.println(test);
        return "name : "+test;
    }

}
