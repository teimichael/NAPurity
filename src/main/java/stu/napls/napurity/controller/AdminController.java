package stu.napls.napurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.napls.napurity.model.Admin;
import stu.napls.napurity.model.User;
import stu.napls.napurity.service.AdminService;
import stu.napls.napurity.service.UserService;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @GetMapping(value = "/get/list")
    public List<Admin> getList() {
        return adminService.findAllAdmin();
    }

    @PostMapping(value = "/create")
    public Admin create() {
        Admin admin = new Admin();
        admin.setPrivilege("super root");

        return adminService.createAdmin(admin);
    }
}
