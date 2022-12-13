package com.wyh.controller;

import com.wyh.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Autowired//本地注入
    @Reference(timeout = 1000,retries = 1,version = "v2.0")//远程注入
    /*  远程注入的执行
     * 1.从zookeeper注册中心获取UserService的访问url
     * 2.进行远程调用RPC
     * 3.将结果封装为一个代理对象，给注入的对象赋值
     */
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }

    @RequestMapping("/find")
    public User findUserById(int id) {
        return userService.findUserById(id);
    }

}
