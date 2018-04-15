package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private static final String PRESENT_3 = "Fizz";
    private static final String PRESENT_5 = "Buzz";
    private static final String PRESENT_7 = "Whizz";
    private List<String> results = new ArrayList<>();


    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(processNumberToString(i));
        }

    }

    public String processNumberToString(int number) {
        String numberString = String.valueOf(number);
        if (numberString.contains("3")) {
            return PRESENT_3;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (number % 3 == 0){
            stringBuffer.append(PRESENT_3);
        }
        if (number % 5 == 0) {
            stringBuffer.append(PRESENT_5);
        }
        if (number % 7 == 0) {
            stringBuffer.append(PRESENT_7);
        }
        return stringBuffer.length() > 0 ? stringBuffer.toString() : numberString;
    }
    public List<String> getResults() {
        return results;
    }
}


