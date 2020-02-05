package com.tw.training;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void init () {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void assertFizzNumber() {
        String num_3 = fizzBuzz.fizzBuzz(3);
        String num_13 = fizzBuzz.fizzBuzz(13);
        String num_30 = fizzBuzz.fizzBuzz(30);
        String num_73 = fizzBuzz.fizzBuzz(73);
        String num_75 = fizzBuzz.fizzBuzz(75);
        String num_630 = fizzBuzz.fizzBuzz(630);
        String num_735 = fizzBuzz.fizzBuzz(735);
        assertEquals("3 is Fizz", "Fizz", num_3);
        assertEquals("13 is Fizz", "Fizz", num_13);
        assertEquals("30 is Fizz", "Fizz", num_30);
        assertEquals("73 is Fizz", "Fizz", num_73);
        assertEquals("75 is Fizz", "Fizz", num_75);
        assertEquals("630 is Fizz", "Fizz", num_630);
        assertEquals("735 is Fizz", "Fizz", num_735);
    }

    @Test
    public void assertBuzzNumber() {
        String num_15 = fizzBuzz.fizzBuzz(15);
        String num_40 = fizzBuzz.fizzBuzz(40);
        assertEquals("15 is Buzz", "Buzz", num_15);
        assertEquals("40 is Buzz", "Buzz", num_40);
    }

    @Test
    public void assertWhizzNumber() {
        String num_14 = fizzBuzz.fizzBuzz(14);
        String num_70 = fizzBuzz.fizzBuzz(70);
        String num_77 = fizzBuzz.fizzBuzz(77);
        assertEquals("14 is Whizz", "Whizz", num_14);
        assertEquals("70 is Whizz", "Whizz", num_70);
        assertEquals("77 is Whizz", "Whizz", num_77);
    }

    @Test
    public void assertFizzBuzzNumber() {
        String num_60 = fizzBuzz.fizzBuzz(60);
        assertEquals("60 is FizzBuzz", "FizzBuzz", num_60);
    }

    @Test
    public void assertBuzzWhizzNumber() {
        String num_35 = fizzBuzz.fizzBuzz(35);
        String num_105 = fizzBuzz.fizzBuzz(105);
        assertEquals("35 is BuzzWhizz", "BuzzWhizz", num_35);
        assertEquals("105 is BuzzWhizz", "BuzzWhizz", num_105);
    }

    @Test
    public void assertFizzWhizzNumber() {
        String num_21 = fizzBuzz.fizzBuzz(21);
        assertEquals("21 is FizzWhizz", "FizzWhizz", num_21);
    }

    @Test
    public void assertFizzBuzzWhizzNumber() {
        String num_210 = fizzBuzz.fizzBuzz(210);
        assertEquals("210 is FizzBuzzWhizz", "FizzBuzzWhizz", num_210);
    }

    @Test
    public void assertNormalNumber() {
        String num_2 = fizzBuzz.fizzBuzz(2);
        String num_16 = fizzBuzz.fizzBuzz(16);
        String num_19 = fizzBuzz.fizzBuzz(19);
        assertEquals("2 is 2", "2", num_2);
        assertEquals("16 is 16", "16", num_16);
        assertEquals("19 is 19", "19", num_19);
    }
}
