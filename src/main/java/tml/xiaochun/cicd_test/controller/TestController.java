package tml.xiaochun.cicd_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：XiaoChun
 * @Date：2024/7/10 下午2:52
 */

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${xiaochun.test}")
    private String test;
    @GetMapping("/test1")
    public String test1() {
        return test;
    }
}
