package com.example.wordsapi.Services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
public class WordsService {
    private final HashSet<String> set = new HashSet<>();

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
            "Fashionable","Obligation","Watch","Metal","Stress","Gown","Shatter","Hip","Series","Sail",
            "band","reactor","enemy","reluctance" ,"fur" ,"confidence" ,"welcome","instinct","buy",
            "retreat","clay","tip","mention" ,"range","trial","wall","authorise","moving","pollution","cutting" ,
            "history","flourish","dominant","glare","cower","cemetery","premium","welfare","vain" , "freight",
            "blade" ,"sleep" ,"defeat" , "long" , "ideal" , "promote" , "jail" , "density" ,"cunning" , "spray" ,
            "curriculum" ,"future" , "pudding" ,"sequence" ,"heaven" , "mirror" , "drawer" , "novel" , "maximum"
    ));


    public HashSet<String> returnRandomWords(){
        Random random = new Random();
        set.clear();
        while(set.size() != 24){
            int index = random.nextInt(142); //142 words in total in the words list.
            set.add(StringUtils.capitalize(words.get(index)));

        }
        return set; //list of 24 different random words.
    }


}
