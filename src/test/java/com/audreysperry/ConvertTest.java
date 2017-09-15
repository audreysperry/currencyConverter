package com.audreysperry;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConvertTest {
    @Test
    public void ConvertJPYToUSDReturnsTheCorrectAmount() throws Exception {
        Money sut = new Money(100, "jpy");
        double convertedAmount = sut.convertToUSD(100, "jpy");
        assertEquals(convertedAmount, 0.90198, 0);
    }

    @Test
    public void ConvertToEURReturnsTheCorrectAmountBasedOnCurrentCurrency() throws Exception {
        Money sut = new Money(100, "jpy");
        double convertedAmount = sut.convertToEUR(100, "jpy");
        assertEquals(convertedAmount, 0.755793, 0);
    }
}
