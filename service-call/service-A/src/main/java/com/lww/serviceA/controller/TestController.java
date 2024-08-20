package com.lww.serviceA.controller;

/**
 * @description:
 * @author: lww
 * @since: 2024/8/20
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiarg
 * @CreateTime 2023/02/01  11:10
 */
@RestController
public class TestController {

    @GetMapping("/server/test")
    public String test(String name) {
        System.out.println(name);
        return "test :  " + name;
    }

}
