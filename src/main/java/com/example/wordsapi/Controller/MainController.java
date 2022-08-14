package com.example.wordsapi.Controller;
import com.example.wordsapi.Repository.UserRepository;
import com.example.wordsapi.Services.UserService;
import com.example.wordsapi.Services.WordsService;
import com.example.wordsapi.UserModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;


@RestController
@RequestMapping(path = "/wordsgame")

public class MainController {
    @Autowired
    UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private WordsService wordsService;

    @GetMapping("/getwords")
    public HashSet<String> getRandomWords(){
       return wordsService.returnRandomWords();
    }

    @PostMapping("/user/register")
    public int registerUser(@RequestBody User user){
        return userService.addUser(user); //returns 0 if successfully added.
    }

    @PostMapping("/user/update/{userId}")
    public int updateuser(@RequestBody User user , @PathVariable int userId){
        return userService.updateUser(user,userId); //returns 0 if successfully updated.
    }

    @DeleteMapping(path = "/users/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }

}
