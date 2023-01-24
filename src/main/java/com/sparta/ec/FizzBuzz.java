package com.sparta.ec;

public class FizzBuzz {


    public static String fizzBuzz(int n) {
        boolean byFive = n % 5 == 0;
        boolean byThree = n % 3 == 0;

        if (n==15) {
            return "FizzBuzz";
        }
        if (n % 15 == 0) {
            return "FizzBuzz";
        }
        if (byFive) {
            return "Buzz";
        }

        if (byThree) {
            return "Fizz";
        }

        return Integer.toString(n);
    }
}

