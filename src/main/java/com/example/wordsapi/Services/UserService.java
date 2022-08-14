package com.example.wordsapi.Services;

import com.example.wordsapi.Repository.UserRepository;
import com.example.wordsapi.UserModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public int addUser(User user) {
        this.userRepository.save(user);
        return 0; //0 means successful
    }

    public int updateUser(User user , int userId){
        this.userRepository.save(user);
        return 0;
    }

    public int deleteUser(int userId){
        this.userRepository.deleteById(userId);
        return 0;
    }
}
