package com.tw.training;

interface FizzBuzzNumber {
    Integer FIZZ = 3;
    Integer Buzz = 5;
    Integer Whizz = 7;
}

public class FizzBuzz {
    public static void main(String []args) {
        System.out.println("hello world");
    }

    public String fizzBuzz(Integer num) {
        String ret = String.valueOf(num);
        if (num % FizzBuzzNumber.FIZZ == 0) {
            ret = "Fizz";
        }
        return ret;
    }
}
