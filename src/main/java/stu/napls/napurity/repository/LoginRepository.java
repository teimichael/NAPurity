package stu.napls.napurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.napls.napurity.model.Login;
import stu.napls.napurity.model.User;

public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsername(String username);
}
