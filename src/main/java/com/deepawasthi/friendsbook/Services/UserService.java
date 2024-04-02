package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.UserEntity;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public UserEntity createUser(UserEntity user);
    public List<UserEntity> retrieveAllUsers();
    public UserEntity retrieveUserData(UUID userId);
    public String deleteUserById(UUID userId);
}
