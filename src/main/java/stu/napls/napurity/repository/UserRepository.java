package stu.napls.napurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.napls.napurity.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
