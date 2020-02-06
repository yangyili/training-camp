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
        Integer start = 1;
        Integer end = 100;
        if (args.length > 0) {
            start = Integer.valueOf(args[0]);
        }
        if (args.length > 1) {
            end = Integer.valueOf(args[1]);
        }
        for (int i = start; i <= end; i++) {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String ret = fizzBuzz.fizzBuzz(i);
            System.out.println(ret);
        }
    }

    public String fizzBuzz(Integer num) {
        if (num <= 0) {
            return "please input positive integer number";
        }
        String ret = String.valueOf(num);
        if (ret.indexOf(Whizz) != -1) {
            if (ret.indexOf(Fizz) != -1) {
                ret = "Fizz";
            } else if (exactDivision(num, FizzBuzzNumber.FIZZ * FizzBuzzNumber.WHIZZ)) {
                ret = "FizzWhizz";
            } else if (exactDivision(num, FizzBuzzNumber.FIZZ)) {
                ret = "Fizz";
            } else if (exactDivision(num, FizzBuzzNumber.WHIZZ)) {
                ret = "Whizz";
            }
        } else if (ret.indexOf(Buzz) != -1) {
            if (exactDivision(num, FizzBuzzNumber.BUZZ * FizzBuzzNumber.WHIZZ)) {
                ret = "BuzzWhizz";
            } else if (exactDivision(num, FizzBuzzNumber.BUZZ)) {
                ret = "Buzz";
            } else if (exactDivision(num, FizzBuzzNumber.WHIZZ)) {
                ret = "Whizz";
            }
        } else {
            if (ret.indexOf(Fizz) != -1) {
                ret = "Fizz";
            } else if (exactDivision(num, FizzBuzzNumber.FIZZ * FizzBuzzNumber.BUZZ * FizzBuzzNumber.WHIZZ)) {
                ret = "FizzBuzzWhizz";
            } else if (exactDivision(num, FizzBuzzNumber.FIZZ * FizzBuzzNumber.BUZZ)) {
                ret = "FizzBuzz";
            } else if (exactDivision(num, FizzBuzzNumber.FIZZ * FizzBuzzNumber.WHIZZ)) {
                ret = "FizzWhizz";
            } else if(exactDivision(num, FizzBuzzNumber.BUZZ * FizzBuzzNumber.WHIZZ)) {
                ret = "BuzzWhizz";
            } else if (exactDivision(num, FizzBuzzNumber.FIZZ)) {
                ret = "Fizz";
            } else if (exactDivision(num, FizzBuzzNumber.BUZZ)) {
                ret = "Buzz";
            } else if (exactDivision(num, FizzBuzzNumber.WHIZZ)) {
                ret = "Whizz";
            }
        }
        return ret;
    }
    private boolean exactDivision(Integer dividend, Integer divisor) {
        return dividend % divisor == 0;
    }
}
