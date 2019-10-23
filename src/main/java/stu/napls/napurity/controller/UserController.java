package stu.napls.napurity.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import stu.napls.napurity.core.security.constant.Role;
import stu.napls.napurity.core.security.response.Response;
import stu.napls.napurity.model.Login;
import stu.napls.napurity.model.User;
import stu.napls.napurity.repository.LoginRepository;
import stu.napls.napurity.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private LoginRepository loginRepository;

    @GetMapping(value = "/get/list")
    public List<User> getList() {
        return userService.findAllUser();
    }

    @GetMapping(value = "/get/info")
    public Response getInfo(HttpSession session) {
        String username =
                String.valueOf(session.getAttribute("username"));
        Login login = loginRepository.findByUsername(username);
        return Response.success(login.getUser());
    }

    @PostMapping(value = "/create")
    public Response create() {
        User user = new User();
        user.setName("ding");
        user.setRole(String.valueOf(Role.USER));
        Login login = new Login();
        login.setUsername("ding");
        login.setPassword("ding");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        login.setPassword(bCryptPasswordEncoder.encode(login.getPassword()));
        login.setUser(userService.createUser(user));
        return Response.success(loginRepository.save(login));
    }
}
