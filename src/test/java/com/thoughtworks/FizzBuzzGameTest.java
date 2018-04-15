package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzGameTest {
    private FizzBuzzGame mFizzBuzzGame;
    @Before
    public void setUp() {
        mFizzBuzzGame = new FizzBuzzGame();
    }
    @Test
    public void should_return_Fizz_when_have_3() {
        processSpecialTestExamples(Arrays.asList(35, 31, 30, 63, 315), "Fizz");
    }

    @Test
    public void should_return_Fizz_when_3_times_have_no_3() {
        processSpecialTestExamples(Arrays.asList(12, 18, 48),"Fizz");
    }
    @Test
    public void should_return_Buzz_when_only_5_times() {
        processSpecialTestExamples(Arrays.asList(5,20,40), "Buzz");
    }

    @Test
    public void should_return_Whizz_when_only_7_times() {
        processSpecialTestExamples(Arrays.asList(7,28,77), "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_3_5_times_have_no_3() {
        processSpecialTestExamples(Arrays.asList(45,75,90), "FizzBuzz");

    }

    @Test
    public void should_return_FizzWhizz_when_3_7_times_have_no_3() {
        processSpecialTestExamples(Arrays.asList(21, 42, 84), "FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_5_7_times_have_no_3() {
        processSpecialTestExamples(Arrays.asList(70,140),"BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_3_5_7_times_have_no_3() {
        processSpecialTestExamples(Arrays.asList(105, 210),"FizzBuzzWhizz");
    }

    @Test
    public void should_return_itself_when_is_normal(){
        processNormalTestExamples(Arrays.asList(11, 22, 79));
    }

    private void processSpecialTestExamples(List<Integer> numberList, String expected) {
        for (int i = 0; i < numberList.size(); i++) {
            Assert.assertEquals(expected, mFizzBuzzGame.processNumberToString(numberList.get(i)));
        }
    }

    private void processNormalTestExamples(List<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            Assert.assertEquals(String.valueOf(numberList.get(i)), mFizzBuzzGame.processNumberToString(numberList.get(i)));

        }
    }
}
