package logic;

//Your cell phone rings. Return true if you should answer it. Normally you answer,
//except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class answerCell {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (isMorning && isMom && !isAsleep || !isMorning && !isAsleep);

    }

    @Test
    public void test() {
        boolean isMorning = true;
        boolean isMom = true;
        boolean isAsleep = false;
        boolean expected = true;
        assertTrue(answerCell(isMorning, isMom, isAsleep) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(answerCell(isMorning, isMom, isAsleep)));
        System.out.println(String.valueOf(answerCell(isMorning, isMom, isAsleep)));
    }

    @Test
    public void test1() {
        boolean isMorning = true;
        boolean isMom = false;
        boolean isAsleep = true;
        boolean expected = false;
        assertTrue(answerCell(isMorning, isMom, isAsleep) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(answerCell(isMorning, isMom, isAsleep)));
        System.out.println(String.valueOf(answerCell(isMorning, isMom, isAsleep)));
    }
}