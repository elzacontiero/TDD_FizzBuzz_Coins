package com.sparta.ec.tdd_lab_coins;
/*
In pairs, solve the following problem:
Write a method with the signature public static String getCoins(int priceInPence)
which takes a sterling amount in pence and returns a String containing the smallest number of coins needed to make up that amount.

For example 123 would return "Pound: 1, 20p: 1, 2p: 1, 1p: 1".
You can format your string however you like as long as it is correct and consistent.

Remember to use a TDD approach so start with the simplest possible value - 1, write a unit test, get it to pass, then refactor as necessary
Repeat with 2, 3, 4 and so on until you can cope with values up to 500.
 */

public class Coins {

    public static String returnCoins(int priceInPence){

        // 200pence = £2; start with the biggest coin
        int twoPoundCoin = priceInPence/200;
        int remaining = priceInPence - twoPoundCoin*200;
        int onePound = remaining/100;
        remaining -= onePound*100;
        int fiftyP = remaining / 50;
        remaining -=  fiftyP*50;
        int twentyP = remaining / 20;
        remaining -= twentyP*20;
        int tenP = remaining / 10;
        remaining -= tenP * 10;
        int fiveP = remaining / 5;
        remaining -= fiveP * 5;
        int twoP = remaining / 2;
        remaining -= twoP*2;

        return String.format("2£:%d;1£:%d;50p:%d;20p:%d;10p:%d;5p:%d;2p:%d;1p:%d",
                twoPoundCoin, onePound, fiftyP, twentyP, tenP, fiveP, twoP, remaining);
    }

}
