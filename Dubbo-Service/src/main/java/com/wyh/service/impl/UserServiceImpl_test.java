package com.wyh.service.impl;

import com.wyh.pojo.User;
import org.apache.dubbo.config.annotation.Service;
import service.UserService;

//@Service
@Service(timeout = 3000,retries = 2,version="v2.0")//这个注解有dubbo提供 将这个类提供的服务对外发布，将访问的地址 IP 端口 路径 注册到注册中心
public class UserServiceImpl_test implements UserService {
    @Override
    public String sayHello() {
        System.out.println("this is the v2.0");
        return "change the world!";
    }

    @Override
    public User findUserById(int id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new User(1,"zhangSan");
    }
}
