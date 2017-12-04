package ap;

import org.junit.Test;

public class hasOne {

    public boolean hasOne(int n) {
        int length = String.valueOf(n).length();
        for (int i=1; i<=length; i++) {
            if (n%10 == 1) return true;
            n = n/10;
        }
        return false;
    }

}

//Given a positive int n, return true if it contains a 1 digit.
//Note: use % to get the rightmost digit, and / to discard the rightmost digit.