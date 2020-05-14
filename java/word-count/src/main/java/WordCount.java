/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

/*
import java.util.HashMap;
public class WordCount{
    HashMap<String,Integer> phrase(String input){
        HashMap<String,Integer> hmap=new HashMap<String,Integer>();
        String words[]=input.split(" ");
        for(int i=0;i<words.length;i++){
            if(!hmap.containsKey(words[i].toLowerCase()))
                hmap.put(words[i],1);
            else{
                int old=hmap.get(words[i]);
                int newValue=old+1;
                hmap.put(words[i],newValue);
            }
        }
        return hmap;
    }
}*/

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    Map<String, Integer> phrase(String s) {
        Map<String, Integer> word2count = new HashMap<>();
        for (String word : s.split("([,.:!&@$%^]|\\s)+")) {
            if (word.startsWith("'") && word.endsWith("'")) {
                word = word.substring(1, word.length() - 1);
            }

            if (word.isEmpty()) {
                continue;
            }

            word = word.toLowerCase();
            incrementWordCount(word2count, word);
        }
        return word2count;
    }

    void incrementWordCount(Map<String, Integer> word2count, String word) {
        word2count.put(word, word2count.getOrDefault(word, 0) + 1);
    }
}
