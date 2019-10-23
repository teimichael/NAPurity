package stu.napls.napurity.service;

import stu.napls.napurity.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAllUser();

    User createUser(User user);
}
