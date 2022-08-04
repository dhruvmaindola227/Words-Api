package com.example.wordsapi.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class HardWordsService {
    private final ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "Pellucid", "Indoctrination", "Gratuitous", "Egregious", "Circumlocution", "Equivocate",
            "Curmudgeon", "Surreptitious", "Puissant", "Solicitous", "Lamentable", "Condemned",
            "Placid", "Momentous", "Chipmunk", "Gratitude", "Pollination", "Armageddon", "Intoxication",
            "Circumference", "Croissant", "Solitude", "Equilibrium", "Amalgamation", "Generation"
    ));

    public ArrayList<String> getList() {
        return list;
    }
}
