package stu.napls.napurity.service;

import stu.napls.napurity.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    User createUser(User user);
}
