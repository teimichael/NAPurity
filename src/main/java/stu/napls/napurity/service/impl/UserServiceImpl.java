package stu.napls.napurity.service.impl;

import org.springframework.stereotype.Service;
import stu.napls.napurity.model.User;
import stu.napls.napurity.repository.UserRepository;
import stu.napls.napurity.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
