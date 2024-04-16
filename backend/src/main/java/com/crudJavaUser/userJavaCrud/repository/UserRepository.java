package com.crudJavaUser.userJavaCrud.repository;

import com.crudJavaUser.userJavaCrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
