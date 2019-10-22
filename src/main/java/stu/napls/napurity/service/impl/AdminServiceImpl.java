package stu.napls.napurity.service.impl;

import org.springframework.stereotype.Service;
import stu.napls.napurity.model.Admin;
import stu.napls.napurity.repository.AdminRepository;
import stu.napls.napurity.service.AdminService;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminRepository adminRepository;


    @Override
    public List<Admin> findAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
