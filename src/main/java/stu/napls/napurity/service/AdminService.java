package stu.napls.napurity.service;

import stu.napls.napurity.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAllAdmin();

    Admin createAdmin(Admin admin);
}
