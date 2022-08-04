package com.example.wordsapi.Services;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class EasyWordsService {

    private final ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "Application", "Motorola", "Package", "India", "Water", "Bottle", "Random",
            "Medicine", "Six", "Games", "Wasteful", "Play" , "Fork", "Switch", "Legs",
            "Selective", "Print", "Nifty", "Violent", "Meddle", "Preach", "Bulking", "Java", "Kotlin"
    ));

    public ArrayList<String> getList(){
        return list;
    }



}


