package com.example.wordsapi.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class MediumWordsService {

    private final ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "Bresenham", "Scissors", "Quinoa", "Callous", "Independence", "Unambiguous",
            "Quiet", "Quite", "Exaggeration", "Introspection", "Toys", "Toothbrush", "Wind",
            "Science", "Accessible", "Signal", "Cut", "Guide", "Book", "Jewel", "Extra",
            "Shrug", "Articulation", "Circulation"
    ));

    public ArrayList<String> getList(){
        return list;
    }
}
