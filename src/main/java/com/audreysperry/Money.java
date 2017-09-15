package com.audreysperry;

public class Money {
    private double amount;
    private String currency;

    public Money() {
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double convertToUSD(int amount, String currency) {
        double usdAmount;
        if(currency == "eur") {
            usdAmount = amount * 1.19334;
        } else if (currency == "jpy") {
            usdAmount = amount * 0.00901980;
        } else if (currency == "btc") {
            usdAmount = amount * 3543.37;
        } else {
            usdAmount = 0;
        }
        return usdAmount;
    }

    public double convertToJPY(int amount, String currency) {
        double jpyAmount;
        if(currency == "eur") {
            jpyAmount = amount * 132.301;
        } else if (currency == "usd") {
            jpyAmount = amount * 110.854;
        } else if (currency == "btc") {
            jpyAmount = amount * 393014.02;
        } else {
            jpyAmount = 0;
        }
        return jpyAmount;
    }

    public double convertToEUR(int amount, String currency) {
        double eurAmount;
        if(currency == "usd") {
            eurAmount = amount * 0.838057;
        } else if (currency == "jpy") {
            eurAmount = amount * 0.00755793;
        } else if ("btc" == currency) {
            eurAmount = amount * 2980.20;
        } else {
            eurAmount = 0;
        }
        return eurAmount;
    }

    public double convertToBTC(int amount, String currency) {
        double btcAmount;
        if(currency == "usd") {
            btcAmount = amount * 0.000281392;
        } else if (currency == "jpy") {
            btcAmount = amount * 0.00000253833;
        } else if (currency == "eur") {
            btcAmount = amount * 0.000335848;
        } else {
            btcAmount = 0;
        }
        return btcAmount;
    }
}
