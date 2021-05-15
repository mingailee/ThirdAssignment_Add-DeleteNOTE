package com.example.textcountersample.utils;

public class NumbersCalculator {
    public static int getNumbersCount(String userInputText){
        int count=0;
        for (char c: userInputText.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
