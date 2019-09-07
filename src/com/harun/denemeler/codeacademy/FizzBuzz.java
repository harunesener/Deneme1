package com.harun.denemeler.codeacademy;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    @Test
    public void test() {

        loopFizzBuzz(1000000);

        Assert.assertEquals(fizzBuzz(8), "8");
        Assert.assertEquals(fizzBuzz(27), FIZZ);
        Assert.assertEquals(fizzBuzz(80), BUZZ);
        Assert.assertEquals(fizzBuzz(90), FIZZ + BUZZ);
    }

    private void loopFizzBuzz(int size) {

        StringBuilder buffer = new StringBuilder();
        final String lineSeparator = System.lineSeparator();

        for (int i = 1; i <= size; i++) {

            String chunk = fizzBuzz(i) + lineSeparator;
            buffer.append(chunk);
        }

        System.out.println(buffer.toString());
    }

    private String fizzBuzz(int i) {

        String label = String.valueOf(i);

        boolean isFizz = i % 3 == 0;
        boolean isBuzz = i % 5 == 0;

        if (isFizz || isBuzz) {
            label = "";
        }
        if (isFizz) {
            label += FIZZ;
        }
        if (isBuzz) {
            label += BUZZ;
        }

        return label;
    }
}