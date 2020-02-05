package com.tw.training;

interface FizzBuzzNumber {
    Integer FIZZ = 3;
    Integer BUZZ = 5;
    Integer WHIZZ = 7;
}

public class FizzBuzz {
    private String Fizz = String.valueOf(FizzBuzzNumber.FIZZ);
    private String Buzz = String.valueOf(FizzBuzzNumber.BUZZ);
    private String Whizz = String.valueOf(FizzBuzzNumber.WHIZZ);

    public static void main(String []args) {
        System.out.println("hello world");
    }

    public String fizzBuzz(Integer num) {
        String ret = String.valueOf(num);
        if (ret.indexOf(Whizz) != -1) {
            if (ret.indexOf(Fizz) != -1) {
                ret = "Fizz";
            } else if (num % (FizzBuzzNumber.FIZZ * FizzBuzzNumber.WHIZZ) == 0) {
                ret = "FizzWhizz";
            } else if (num % FizzBuzzNumber.FIZZ == 0) {
                ret = "Fizz";
            } else if (num % FizzBuzzNumber.WHIZZ == 0) {
                ret = "Whizz";
            }
        } else if (ret.indexOf(Buzz) != -1) {
            if (num % (FizzBuzzNumber.BUZZ * FizzBuzzNumber.WHIZZ) == 0) {
                ret = "BuzzWhizz";
            } else if (num % FizzBuzzNumber.BUZZ == 0) {
                ret = "Buzz";
            } else if (num % FizzBuzzNumber.WHIZZ == 0) {
                ret = "Whizz";
            }
        } else {
            if (ret.indexOf(Fizz) != -1) {
                ret = "Fizz";
            } else if (num % (FizzBuzzNumber.FIZZ * FizzBuzzNumber.BUZZ * FizzBuzzNumber.WHIZZ) == 0) {
                ret = "FizzBuzzWhizz";
            } else if (num % (FizzBuzzNumber.FIZZ * FizzBuzzNumber.BUZZ) == 0) {
                ret = "FizzBuzz";
            } else if (num % (FizzBuzzNumber.FIZZ * FizzBuzzNumber.WHIZZ) == 0) {
                ret = "FizzWhizz";
            } else if(num % (FizzBuzzNumber.BUZZ * FizzBuzzNumber.WHIZZ) == 0) {
                ret = "BuzzWhizz";
            } else if (num % FizzBuzzNumber.FIZZ == 0) {
                ret = "Fizz";
            } else if (num % FizzBuzzNumber.BUZZ == 0) {
                ret = "Buzz";
            } else if (num % FizzBuzzNumber.WHIZZ == 0) {
                ret = "Whizz";
            }
        }
        return ret;
    }
}
