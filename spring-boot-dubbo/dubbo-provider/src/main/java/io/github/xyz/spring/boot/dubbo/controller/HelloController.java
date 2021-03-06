package io.github.xyz.spring.boot.dubbo.controller;

import io.github.xyz.spring.boot.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoyunxing
 * @date 2020/11/10 19:15
 */
@RestController
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("/echo")
    public String echo() {
        return helloService.echo();
    }
}
