package logic;

import org.junit.Test;

public class maxMod5 {

    public int maxMod5(int a, int b) {
        int result = 0;
        int smaller = 0;
        int bigger = 0;
        if (a != b) {
            if ( a < b ) {
                smaller = a;
                bigger = b;
            } else {
                smaller = b;
                bigger = a;
            }
            if (a%5 == b%5) {
                result = smaller;
            } else {
                result = bigger;
            }
        }
        return result;
    }
}

//Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5,
//then the return the smaller value. However, in all cases, if the two values are the same, return 0.
//Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.