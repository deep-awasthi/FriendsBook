package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.UserEntity;
import com.deepawasthi.friendsbook.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp joiningDate = new Timestamp(time);
        user.setJoiningDate(joiningDate);
        user.setActive(true);
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity retrieveUserData(UUID userId) {
        return userRepository.findById(userId).orElseThrow(()->new RuntimeException("User Not Found"));
    }

    @Override
    public String deleteUserById(UUID userId) {
        userRepository.deleteById(userId);
        return "User Deleted Successfully";
    }
}
