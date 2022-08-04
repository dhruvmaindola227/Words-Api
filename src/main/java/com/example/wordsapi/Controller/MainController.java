package com.example.wordsapi.Controller;

import com.example.wordsapi.Services.EasyWordsService;
import com.example.wordsapi.Services.HardWordsService;
import com.example.wordsapi.Services.MediumWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "wordsgame")
public class MainController {
    @Autowired
    EasyWordsService easy;
    @Autowired
    MediumWordsService medium;
    @Autowired
    HardWordsService hard;

    @GetMapping("/easy")
    public ArrayList<String> getEasyArray(){
       return easy.getList();
    }

    @GetMapping("/medium")
    public ArrayList<String> getMediumArray(){
        return medium.getList();
    }

    @GetMapping("/hard")
    public ArrayList<String> getHardArray(){
        return hard.getList();
    }
}
