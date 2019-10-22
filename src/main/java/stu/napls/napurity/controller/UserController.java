package stu.napls.napurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.napls.napurity.model.User;
import stu.napls.napurity.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/get/list")
    public List<User> getList() {
        return userService.findAllUser();
    }

    @PostMapping(value = "/create")
    public User create() {
        User user = new User();
        user.setName("ding");
        return userService.createUser(user);
    }
}
