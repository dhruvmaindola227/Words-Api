package com.example.wordsapi.Services;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WordsService {

    private static final ArrayList<String> words =new ArrayList<>(Arrays.asList(
            "Application", "Motorola", "Package", "India", "Water", "Bottle", "Random",
            "Medicine", "Six", "Games", "Wasteful", "Play" , "Fork", "Switch", "Legs",
            "Selective", "Print", "Nifty", "Violent", "Meddle", "Preach", "Bulking", "Java", "Kotlin",
            "Bresenham", "Scissors", "Quinoa", "Callous", "Independence", "Unambiguous",
            "Quiet", "Quite", "Exaggeration", "Introspection", "Toys", "Toothbrush", "Wind",
            "Science", "Accessible", "Signal", "Cut", "Guide", "Book", "Jewel", "Extra",
            "Shrug", "Articulation", "Circulation","Pellucid", "Indoctrination", "Gratuitous", "Egregious", "Circumlocution",
            "Equivocate", "Curmudgeon", "Surreptitious", "Puissant", "Solicitous", "Lamentable", "Condemned",
            "Placid", "Momentous", "Chipmunk", "Gratitude", "Pollination", "Armageddon", "Intoxication",
            "Circumference", "Croissant", "Solitude", "Equilibrium", "Amalgamation", "Generation",
            "Ladder", "Tip", "Verdict" , "Detective" , "Coat","Tank","Medal","Mosaic","Degree","Forest",
            "Fashionable","Obligation","Watch","Metal","Stress","Gown","Shatter","Hip","Series","Sail"
    ));


    public ArrayList<String> returnRandomWords(){
        Random random = new Random();
        final HashSet<String> set = new HashSet<>();
        while(set.size() != 24){
            int index = random.nextInt(93); //94 words in total in the words list.
            set.add(words.get(index));
        }
        return new ArrayList<>(set); //list of 24 different random words.
    }


}
