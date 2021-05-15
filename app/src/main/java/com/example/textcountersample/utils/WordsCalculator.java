package com.example.textcountersample.utils;

public class WordsCalculator {
    public static int getWordsCount(String userInputText){
        if (userInputText == null || userInputText.isEmpty()) {
            return 0;
        }
        String[] words = userInputText.split("\\s+");
        return words.length;
    }
    }


