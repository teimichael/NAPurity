package stu.napls.napurity.service.impl;

import org.springframework.stereotype.Service;
import stu.napls.napurity.model.User;
import stu.napls.napurity.repository.UserRepository;
import stu.napls.napurity.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        User user = null;
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            user = result.get();
        }
        return user;
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
