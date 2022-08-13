package com.example.wordsapi.Controller;
import com.example.wordsapi.Services.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashSet;


@RestController
@RequestMapping(path = "/wordsgame")

public class MainController {

    @Autowired
    WordsService wordsService;

    @GetMapping("/getwords")
    public ArrayList<String> getRandomWords(){
       return wordsService.returnRandomWords();
    }

}
