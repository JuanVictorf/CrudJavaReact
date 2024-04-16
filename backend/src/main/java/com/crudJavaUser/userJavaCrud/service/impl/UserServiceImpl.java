package com.crudJavaUser.userJavaCrud.service.impl;

import com.crudJavaUser.userJavaCrud.model.User;
import com.crudJavaUser.userJavaCrud.repository.UserRepository;
import com.crudJavaUser.userJavaCrud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User create(User userToCreate) {
        return userRepository.save(userToCreate);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User deleteUserById(Long id){
        userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário com ID " + id + " não encontrado"));

        userRepository.deleteById(id);
        return null;
    }

    @Override
    public User updateUserById(Long id, User novoUsuario) {
        User usuarioExistente = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário com ID " + id + " não encontrado"));


        usuarioExistente.setName(novoUsuario.getName());
        usuarioExistente.setLogin(novoUsuario.getLogin());
        usuarioExistente.setEmail(novoUsuario.getEmail());
        usuarioExistente.setPassword(novoUsuario.getPassword());


        return userRepository.save(usuarioExistente);
    }


}
