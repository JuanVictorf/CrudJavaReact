package com.crudJavaUser.userJavaCrud.service;

import com.crudJavaUser.userJavaCrud.model.User;


import java.util.List;

public interface UserService {

    User create(User userToCreate);

    User findById(Long id);

    List<User> findAll();

    User deleteUserById(Long id);

    User updateUserById(Long id, User novoUsuario);

}
