package com.tw.training;
import static org.junit.Assert.assertEquals;

import org.junit.After;
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
        String num_108 = fizzBuzz.fizzBuzz(108);
        String num_1032 = fizzBuzz.fizzBuzz(1032);
        assertEquals("3 is Fizz", "Fizz", num_3);
        assertEquals("108 is Fizz", "Fizz", num_108);
        assertEquals("1032 is Fizz", "Fizz", num_1032);
    }

    @Test
    public void assertBuzzNumber() {
        String num_25 = fizzBuzz.fizzBuzz(25);
        assertEquals("25 is Buzz", "Buzz", num_25);
    }
}
