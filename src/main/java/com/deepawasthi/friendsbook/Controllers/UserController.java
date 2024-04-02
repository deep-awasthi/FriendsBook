package com.deepawasthi.friendsbook.Controllers;

import com.deepawasthi.friendsbook.Entities.UserEntity;
import com.deepawasthi.friendsbook.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/userService")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/save")
    public UserEntity saveUser(@RequestBody UserEntity user){
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<UserEntity> getAllUsers(){
        return userService.retrieveAllUsers();
    }

    @GetMapping("/users/{userId}")
    public UserEntity getUserById(@PathVariable("userId") UUID userId){
        return userService.retrieveUserData(userId);
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUserById(@PathVariable("userId") UUID userId){
        return userService.deleteUserById(userId);
    }
}
