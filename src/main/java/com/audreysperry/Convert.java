package com.audreysperry;

public class Convert {

    public static void main(String[] args) {
        Money myCash = new Money(100, "usd");

       double myBitcoin = myCash.convertToBTC(100, "usd");
        System.out.println(myBitcoin);
    }
}
