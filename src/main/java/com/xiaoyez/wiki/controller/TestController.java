package com.xiaoyez.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller 一般返回一个页面
//一般用来返回字符串
@RestController
public class TestController {
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
        return "Hello World!";
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post," + name;
    }

}
