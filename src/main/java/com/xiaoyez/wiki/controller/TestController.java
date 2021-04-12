package com.xiaoyez.wiki.controller;

import com.xiaoyez.wiki.domain.Test;
import com.xiaoyez.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// @Controller 一般返回一个页面
//一般用来返回字符串
@RestController
public class TestController {

    // Spring Boot扫描到@Value就会去找test.hello的配置项
    // :后面是默认的配置值
    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;
    /*
    * GET, POST, PUT, DELETE
    *
    * /user?id=1
    * restful 风格: /user/1
    * @RequestMapping四种访问方式都可以
    * @GetMapping 只支持get
    * @PostMapping, @PutMapping, @DeleteMapping
    * @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    * Response Code: 405 Method Not allowed
    *
    * */
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post," + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
