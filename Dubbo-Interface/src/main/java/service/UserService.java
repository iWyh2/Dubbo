package service;

import com.wyh.pojo.User;

public interface UserService {
    String sayHello();

    User findUserById(int id);
}
