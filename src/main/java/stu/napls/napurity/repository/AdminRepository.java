package stu.napls.napurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.napls.napurity.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
