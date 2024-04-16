package com.crudJavaUser.userJavaCrud.controller;

import com.crudJavaUser.userJavaCrud.model.User;
import com.crudJavaUser.userJavaCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public void postUser(@RequestBody User userToCreate){
        userService.create(userToCreate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id){
        var user = userService.deleteUserById(id);
        return ResponseEntity.ok("Usuario excluido.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User novoUsuario) {
        User usuarioAtualizado = userService.updateUserById(id, novoUsuario);
        return ResponseEntity.ok(usuarioAtualizado);
    }

}
