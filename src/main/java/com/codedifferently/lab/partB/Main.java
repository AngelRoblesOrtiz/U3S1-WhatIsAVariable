package com.codedifferently.lab.partB;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coin coin0 = new Coin();
        Coin coin1 = new Coin("Penny", .01);
        Coin coin2 = new Coin("Quarter", .25);
        Coin coin3 = new Coin("Dime", .10);
        Coin coin4 = new Coin("Quarter", .25);
        Coin coin5 = new Coin("Penny", .01);

        Coin[] coins = {coin0, coin1, coin2, coin3, coin4, coin5};
        Arrays.sort(coins);

        int pennyCount = 0;
        int dimeCount = 0;
        int quarterCount = 0;

        for (Coin coin: coins) {
            if (coin.getName().equals("Penny")){
                pennyCount++;
            } else if (coin.getName().equals("Dime")) {
                dimeCount++;
            } else if (coin.getName().equals("Quarter")) {
                quarterCount++;
            }
        }

        String pennies = "";
        String dimes = "";
        String quarters = "";

        if (pennyCount > 0) {
            pennies = pennyCount + " Penny coin" + (pennyCount > 1 ? "s" : "") + ", ";
        }

        if (dimeCount > 0) {
            dimes = dimeCount + " Dime coin" + (dimeCount > 1 ? "s" : "") + ", ";
        }

        if (quarterCount > 0) {
            quarters = quarterCount + " Quarter coin" + (quarterCount > 1 ? "s" : "");
        }

        System.out.println("You have: " + pennies + dimes + quarters);
    }
}
